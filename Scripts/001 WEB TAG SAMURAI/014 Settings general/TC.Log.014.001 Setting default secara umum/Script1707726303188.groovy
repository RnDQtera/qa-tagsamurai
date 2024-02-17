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

WebUI.delay(2)

WebUI.setText(findTestObject('Page Tag Samurai/1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('Page Tag Samurai/1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('Page Tag Samurai/1 Object0003_Button login'))

WebUI.click(findTestObject('Page Tag Samurai/1 Object0004_Module Fixed Asset'))

WebUI.delay(20)

WebUI.click(findTestObject('Page Tag Samurai/1 Object0159_menu atas setting'))

WebUI.delay(15)

WebUI.click(findTestObject('Page Tag Samurai/Setting general settings/Object0288_menu Setting general'))

WebUI.click(findTestObject('Page Tag Samurai/Setting general settings/Object0287_dropdown time format general setting'))

WebUI.delay(3)

WebUI.click(findTestObject('Page Tag Samurai/Setting general settings/Object0291_pilihan 1 dropdown time format general settings'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('Page Tag Samurai/Setting general settings/Object0286_dropdown date format general setting'))

WebUI.delay(3)

WebUI.click(findTestObject('Page Tag Samurai/Setting general settings/Object0289_pilihan 1 dropdown date format general setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Page Tag Samurai/Setting general settings/Object0290_save general setting'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.014.001 Setting default secara umum.png', FailureHandling.STOP_ON_FAILURE)

