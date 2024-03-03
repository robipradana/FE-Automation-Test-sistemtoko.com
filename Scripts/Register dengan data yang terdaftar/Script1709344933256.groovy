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

WebUI.openBrowser('https://sistemtoko.com')

WebUI.verifyElementText(findTestObject('Register/h1_Transformasi Digital'), 'Transformasi Digital Dengan Sistem, Tim & Mentoring Gratis')

WebUI.click(findTestObject('Register/btn_register'))

WebUI.verifyElementText(findTestObject('Register/h3_Register'), 'Register')

WebUI.verifyElementText(findTestObject('Register/Email'), 'Email')

WebUI.verifyElementVisible(findTestObject('Register/inpt_email'))

WebUI.setText(findTestObject('Register/inpt_email'), 'robipradana1996@gmail.com')

WebUI.verifyElementText(findTestObject('Register/Password'), 'Password')

WebUI.verifyElementVisible(findTestObject('Register/inpt_Password'))

WebUI.setEncryptedText(findTestObject('Register/inpt_Password'), 'iqXVRUFiN/nfzg4myhnGog==')

WebUI.verifyElementText(findTestObject('Register/div_Re-enter Password'), 'Re-enter Password')

WebUI.verifyElementVisible(findTestObject('Register/div_Re-enter Password'))

WebUI.setEncryptedText(findTestObject('Register/Re-enter Password'), 'iqXVRUFiN/nfzg4myhnGog==')

WebUI.verifyElementText(findTestObject('Register/Full Name'), 'Full Name')

WebUI.verifyElementVisible(findTestObject('Register/inpt_Full Name'))

WebUI.setText(findTestObject('Register/inpt_Full Name'), 'robipradana')

WebUI.verifyElementText(findTestObject('Register/Phone'), 'Phone')

WebUI.verifyElementVisible(findTestObject('Register/inpt_Phone'))

WebUI.setText(findTestObject('Register/inpt_Phone'), '083817562956')

WebUI.verifyElementText(findTestObject('Register/btn_Register2'), 'Register')

WebUI.click(findTestObject('Register/btn_Register2'))

WebUI.verifyElementText(findTestObject('Register/span_Operation Failed'), 'Operation Failed')

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

