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

WebUI.click(findTestObject('Page Tag Samurai/Setting custom field/Object0336_menu custom field'))

WebUI.delay(12)

WebUI.click(findTestObject('Page Tag Samurai/Setting custom field/Object0343_tambah custom field'))

WebUI.delay(8)

WebUI.setText(findTestObject('Page Tag Samurai/Setting custom field/Object0334_ketik nama field'), 'Alamat')

WebUI.click(findTestObject('Page Tag Samurai/Setting custom field/Object0333_dropdown tipe data field'))

WebUI.delay(5)

WebUI.click(findTestObject('Page Tag Samurai/Setting custom field/Object0338_pilihan 1 tipe data field'))

WebUI.click(findTestObject('Page Tag Samurai/Setting custom field/Object0337_pilih kategori custom field'))

WebUI.click(findTestObject('Page Tag Samurai/Setting custom field/Object0340_select all kategori custom field'))

WebUI.click(findTestObject('Page Tag Samurai/Setting custom field/Object0330_apply select kategori custom field'))

WebUI.delay(3)

WebUI.click(findTestObject('Page Tag Samurai/Setting custom field/Object0344_tidak dibutuhkan'))

WebUI.click(findTestObject('Page Tag Samurai/Setting custom field/Object0342_submit tambah custom field'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.011.001 Menambah custom field.png', FailureHandling.STOP_ON_FAILURE)

