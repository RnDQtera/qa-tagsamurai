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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('1 Object001_email'), GlobalVariable.email)

WebUI.setText(findTestObject('1 Object002_pw'), GlobalVariable.pw)

WebUI.delay(4)

WebUI.click(findTestObject('1 Object003_btn login'))

WebUI.click(findTestObject('1 Object004_fixedasset module'))

WebUI.delay(20)

WebUI.click(findTestObject('1 Object Navbar - Fixed Asset'))

WebUI.click(findTestObject('1 Object0007_menu available fixed asset'))

WebUI.click(findTestObject('1 Object013_Button Search'))

WebUI.setText(findTestObject('1 Object014_Field Search'), 'CCTV Outdoor - 2')

WebUI.sendKeys(findTestObject('1 Object014_Field Search'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Tracking/Object351_Single Action'))

WebUI.scrollToElement(findTestObject('Tracking/Object351_Single Action'), 3)

WebUI.click(findTestObject('Tracking/Object352_Choose Report Missing'))

WebUI.setText(findTestObject('Tracking/Object353_Set Text'), 'Missing Asset')

WebUI.click(findTestObject('Tracking/Object354_Submit Report Missing'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Tracking/Object355_Confirm Report'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Tracking/Report Tracking.png', FailureHandling.STOP_ON_FAILURE)

