import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.delay(3)

WebUI.setText(findTestObject('1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.delay(3)

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(10)

WebUI.click(findTestObject('1 Object1592_maintenance'))

WebUI.delay(10)

WebUI.click(findTestObject('Menu maintenance service center list/Object1920_service center'))

WebUI.delay(10)

WebUI.click(findTestObject('Menu maintenance service center list/Object1943_filter'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center list/Object1944_dd keaktifan'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center list/Object1945_aktif'))

WebUI.click(findTestObject('Menu maintenance service center list/Object1946_dd city'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center list/Object1947_cb city'))

WebUI.click(findTestObject('Menu maintenance service center list/Object1948_select cat'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center list/Object1949_cb furn'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center list/Object1950_apply cat'))

WebUI.click(findTestObject('Menu maintenance service center list/Object1951_dd br'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center list/Object1956_cb 1'))

WebUI.click(findTestObject('Menu maintenance service center list/Object1957_date'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center list/Object1958_tgl 1'))

WebUI.click(findTestObject('Menu maintenance service center list/Object1959_tgl 31'))

WebUI.click(findTestObject('Menu maintenance service center list/Object1960_dd mod by'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center list/Object1961_cb 1 m'))

WebUI.click(findTestObject('Menu maintenance service center list/Object1962_apply filter'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.085.003 filter service center.png', FailureHandling.STOP_ON_FAILURE)

