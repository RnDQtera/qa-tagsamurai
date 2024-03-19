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

WebUI.delay(3)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.delay(3)

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(10)

WebUI.click(findTestObject('1 Object1592_maintenance'))

WebUI.delay(10)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1730_sch task'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1731_scan rfid'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance maintenable asset/Object1594_sync'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance maintenable asset/Object1595_close'))

WebUI.delay(3)

'untuk test antara QR TRUK 14, RFID 16 20 21 BERSTATUS UNDER MAINTENANCE'
WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1731_scan rfid'))

WebUI.delay(8)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1759_titik 3'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1782_report damaged'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1783_scan tag'))

WebUI.delay(8)

WebUI.uploadFile(findTestObject('Menu maintenance routine scheduled task/Object1784_upload foto'), 'C:\\Users\\aplikasi internal\\Downloads\\kursiolympic.jpg')

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1787_apply doc'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance routine scheduled task/Object1785_add note'), 'updateeeeeeeee')

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1786_submit report'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1788_ya'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.080.010 report damaged.png', FailureHandling.STOP_ON_FAILURE)
