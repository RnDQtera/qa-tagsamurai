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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(20)

WebUI.click(findTestObject('1 Object0159_menu atas setting'))

WebUI.click(findTestObject('Setting user/Object0228_Menu user'))

WebUI.click(findTestObject('Setting user/Object0193_Button Search user'))

WebUI.setText(findTestObject('Setting user/Object0202_Ketik search user'), 'sultan')

WebUI.sendKeys(findTestObject('Setting user/Object0202_Ketik search user'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Menu titik 3 fixed asset transfer transaction/Menu titik 3 setting user/Object0225_Titik 3 user'))

WebUI.click(findTestObject('Menu titik 3 fixed asset transfer transaction/Menu titik 3 setting user/Object0227_Hapus user'))

WebUI.click(findTestObject('Menu titik 3 fixed asset transfer transaction/Menu titik 3 setting user/Object0216_Button yes delete'))

