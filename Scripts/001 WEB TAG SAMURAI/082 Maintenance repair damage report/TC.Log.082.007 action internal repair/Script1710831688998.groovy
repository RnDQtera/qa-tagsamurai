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

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1815_repair'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1814_scan rfid'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance maintenable asset/Object1594_sync'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance maintenable asset/Object1595_close'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1817_search'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance repair damaged report/Object1818_ketik search'), 'reported damage')

WebUI.sendKeys(findTestObject('Menu maintenance repair damaged report/Object1818_ketik search'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1854_titik 3'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1855_action 1'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1856_scan tag'))

WebUI.delay(6)

WebUI.setText(findTestObject('Menu maintenance repair damaged report/Object1857_ketik detail'), 'repair')

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1858_dd handled'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1859_cb 1'))

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1860_submit repair'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.082.007 internal repair.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1 Object2228_notifikasi'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/Notifikasi/TC.Log.082.007 internal repair.png', FailureHandling.STOP_ON_FAILURE)

