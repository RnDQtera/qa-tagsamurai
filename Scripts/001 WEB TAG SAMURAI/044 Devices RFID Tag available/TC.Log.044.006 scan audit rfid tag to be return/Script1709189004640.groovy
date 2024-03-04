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

WebUI.navigateToUrl(GlobalVariable.localhost)

WebUI.click(findTestObject('1 localhost - advance'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1 localhost - process localhost'), FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.delay(3)

WebUI.setText(findTestObject('1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(15)

WebUI.click(findTestObject('1 Object0770_menu atas devices'))

WebUI.delay(5)

WebUI.click(findTestObject('1 Object0771_devices rfid qr tag'))

WebUI.delay(15)

WebUI.click(findTestObject('Menu devices RFID Tag Available/Object0802_menu rfid tag available'))

WebUI.delay(5)

WebUI.click(findTestObject('Menu devices RFID Tag Available/Object1080_bt scan audit'))

WebUI.delay(5)

WebUI.click(findTestObject('Menu devices RFID Tag Available/Object1081_start audit'))

WebUI.delay(5)

WebUI.click(findTestObject('Menu devices RFID Tag Available/Object1083_sync now'))

WebUI.delay(5)

WebUI.click(findTestObject('Menu devices RFID Tag Available/Object1084_close sync'))

WebUI.delay(5)

WebUI.click(findTestObject('Menu devices RFID Tag Available/Object1081_start audit'))

WebUI.delay(5)

WebUI.click(findTestObject('Menu devices rfid tag damaged missing/Object1247_stop audit'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices rfid tag damaged missing/Object1248_select action'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices rfid tag damaged missing/Object1249_move to available'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices rfid tag damaged missing/Object1250_submit audit'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices rfid tag damaged missing/Object1251_pindahkan audit'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.044.006 scan devices rfid tag audit.png', FailureHandling.STOP_ON_FAILURE)

