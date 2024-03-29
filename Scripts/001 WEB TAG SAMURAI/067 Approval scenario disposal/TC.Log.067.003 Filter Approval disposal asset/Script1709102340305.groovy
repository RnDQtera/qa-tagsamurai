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

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(15)

WebUI.click(findTestObject('1 Object0960_menu atas approval'))

WebUI.delay(12)

WebUI.click(findTestObject('Menu approval scenario disposal/Object0961_Menu Approval scenario disposal'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(8)

WebUI.click(findTestObject('Menu approval scenario disposal/Object0979_bt filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(8)

WebUI.click(findTestObject('Menu approval scenario disposal/Object1127_date'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Menu approval scenario disposal/Object1128_mundur dat'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Menu approval scenario disposal/Object1129_tgl 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu approval scenario disposal/Object1130_tgl 30'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Menu approval scenario disposal/Object1125_dd manager'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Menu approval scenario disposal/Object1126_cb manager'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu approval scenario disposal/Object0980_dropdown filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Menu approval scenario disposal/Object0981_checkbox filter'))

WebUI.click(findTestObject('Menu approval scenario disposal/Object1361_select g d'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu approval scenario disposal/Object1362_lt 4 d'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu Appoval borrowing/Object1361_apply g'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu approval scenario disposal/Object0982_apply filter'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.067.003 Filter approval disposal asset.png', FailureHandling.STOP_ON_FAILURE)

