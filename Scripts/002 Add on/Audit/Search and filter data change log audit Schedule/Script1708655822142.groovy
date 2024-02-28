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

WebUI.click(findTestObject('1 Object003_btn login'))

WebUI.delay(10)

WebUI.click(findTestObject('1 Object004_fixedasset module'))

WebUI.delay(20)

WebUI.click(findTestObject('1 Object016_Button Audit'))

WebUI.click(findTestObject('Audit/Object446_Change log audit'))

WebUI.delay(2)

WebUI.click(findTestObject('Audit/Object447_Search changelog audit'))

WebUI.setText(findTestObject('Audit/Object448_Field seacrh change log audit'), 'SAUD-240223-0002')

WebUI.sendKeys(findTestObject('Audit/Object448_Field seacrh change log audit'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Audit/Object448_Field seacrh change log audit'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('Audit/Object448_Field seacrh change log audit'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Audit/Object449_filter change log audit schedule'))

WebUI.click(findTestObject('Audit/Object450_select date'))

WebUI.delay(2)

WebUI.click(findTestObject('Audit/Object451_pick date'))

WebUI.click(findTestObject('Audit/Object450_select date'))

WebUI.delay(2)

WebUI.click(findTestObject('Audit/Object452_select action'))

WebUI.delay(2)

WebUI.click(findTestObject('Audit/Object453_pick action'))

WebUI.delay(2)

WebUI.click(findTestObject('Audit/Object454_select field'))

WebUI.click(findTestObject('Audit/Object455_pick the field'))

WebUI.delay(2)

WebUI.click(findTestObject('Audit/Object456_select modified'))

WebUI.click(findTestObject('Audit/Object457_pick modified'))

WebUI.delay(2)

WebUI.click(findTestObject('Audit/Object456_select modified'))

WebUI.click(findTestObject('Audit/Object458_apply filter'))

