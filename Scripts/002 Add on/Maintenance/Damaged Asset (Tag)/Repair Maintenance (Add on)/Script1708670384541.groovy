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

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.localhost)

WebUI.click(findTestObject('1 localhost - advance'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1 localhost - process localhost'), FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('1 Object001_email'), GlobalVariable.email)

WebUI.setText(findTestObject('1 Object002_pw'), GlobalVariable.pw)

WebUI.click(findTestObject('1 Object003_btn login'))

WebUI.click(findTestObject('1 Object004_fixedasset module'))

WebUI.delay(20)

WebUI.click(findTestObject('1 localhost -Add on'))

WebUI.click(findTestObject('1 localhost -Add on Maintenance'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object210_tab repair'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object216_single action repair maintenance'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object217_choose Repair'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object218_scan asset Repair'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object286_sync asset repair'))

WebUI.click(findTestObject('1 Object011_closed scan rfid in asset repair'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Damaged Asset (Tag)/Object223a_Scan RFID after sync'))

WebUI.delay(3)

WebUI.click(findTestObject('Damaged Asset (Tag)/Object221_Input Damage Details'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Damaged Asset (Tag)/Object221_Input Damage Details'), 'asset rusak')

WebUI.click(findTestObject('Damaged Asset (Tag)/Object222_will be handled by'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object223_choose internal repair'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object223b_Submit Asset Repair'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Damaged and maintenance/Asset Repair.png', FailureHandling.STOP_ON_FAILURE)

