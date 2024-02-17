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

WebUI.delay(5)

WebUI.setText(findTestObject('1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(20)

WebUI.click(findTestObject('1 Object0159_menu atas setting'))

WebUI.delay(15)

WebUI.click(findTestObject('Setting role/Object0250_menu role'))

WebUI.delay(12)

WebUI.click(findTestObject('Setting role/Object0246_filter role'))

WebUI.click(findTestObject('Setting role/Object0245_dropdown filter role'))

WebUI.delay(10)

WebUI.click(findTestObject('Setting role/Object0243_checkbox filter role 2'))

WebUI.delay(8)

WebUI.click(findTestObject('Setting role/Object0239_apply filter role'))

WebUI.delay(5)

WebUI.click(findTestObject('Menu titik 3 fixed asset transfer transaction/Menu titik 3 setting role/Object0261_titik 3'))

WebUI.click(findTestObject('Setting role/Object0247_hapus role'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu titik 3 fixed asset transfer transaction/Menu titik 3 setting role/Object0262_ya hapus role'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.007.009 menghapus role.png', FailureHandling.STOP_ON_FAILURE)

