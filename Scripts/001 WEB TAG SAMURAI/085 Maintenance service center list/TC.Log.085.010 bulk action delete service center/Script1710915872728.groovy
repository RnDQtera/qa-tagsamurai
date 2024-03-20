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

WebUI.click(findTestObject('Menu maintenance service center list/Object1941_search'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance service center list/Object1942_ketik search'), 'piala')

WebUI.sendKeys(findTestObject('Menu maintenance service center list/Object1942_ketik search'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center list/Object1979_cb 1'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center list/Object1980_bulk action'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center list/Object1985_bulk del'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center list/Object1982_apply bulk'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center list/Object1983_ya'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.085.010 bulk action delete service center.png', FailureHandling.STOP_ON_FAILURE)

