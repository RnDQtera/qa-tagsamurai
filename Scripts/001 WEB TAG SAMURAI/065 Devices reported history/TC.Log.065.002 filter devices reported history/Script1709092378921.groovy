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

WebUI.click(findTestObject('1 Object0770_menu atas devices'))

WebUI.delay(3)

WebUI.click(findTestObject('1 Object0771_devices rfid qr tag'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(12)

WebUI.click(findTestObject('Menu devices reported RFID tag/Object0923_menu reported'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(8)

WebUI.click(findTestObject('Menu devices reported history/Object0951_menu history'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(8)

WebUI.click(findTestObject('Menu devices reported history/Object0956_bt filter'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu devices reported history/Object0957_dropdown tag filter'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu devices reported history/Object0958_checkbox rfid dan qr'))

WebUI.click(findTestObject('Menu devices reported history/Object1067_dropdown tag'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu devices reported history/Object1068_checkbox tag'))

WebUI.click(findTestObject('Menu devices reported history/Object1069_dd reported tag'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu devices reported history/Object1070_cb reported rfid'))

WebUI.click(findTestObject('Menu devices reported history/Object1071_dd reported by'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu devices reported history/Object1072_cb reported by'))

WebUI.click(findTestObject('Menu devices reported history/Object1073_dd action filter'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu devices reported history/Object1074_ketik action'), 'decline')

WebUI.click(findTestObject('Menu devices reported history/Object1075_cb action 1'))

WebUI.click(findTestObject('Menu devices reported history/Object1187_dd manager'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu devices reported history/Object1188_cb manager'))

WebUI.click(findTestObject('Menu devices reported history/Object1189_date 1'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu devices reported history/Object1190_mundur date'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu devices reported history/Object1191_tgl 1'))

WebUI.click(findTestObject('Menu devices reported history/Object1192_tgl 29'))

WebUI.click(findTestObject('Menu devices reported history/Object0959_apply filter'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.065.002 filter devices reported history.png', FailureHandling.STOP_ON_FAILURE)

