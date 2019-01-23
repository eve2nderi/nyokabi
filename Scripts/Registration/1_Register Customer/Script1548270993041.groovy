import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Launch App'), [('App') : 'www.masoko.com/'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Shop Online in Kenya - Pay Con/lnk_Register'))

WebUI.setText(findTestObject('Page_Create New Customer Account/input_Personal Information_fir'), firstname)

WebUI.setText(findTestObject('Page_Create New Customer Account/input_Personal Information_las'), lastname)

WebUI.setText(findTestObject('Page_Create New Customer Account/input_land Islands_store_code_'), storecode)

WebUI.setText(findTestObject('Page_Create New Customer Account/input_land Islands_mobile'), phone)

WebUI.setText(findTestObject('Page_Create New Customer Account/input_Sign-in Information_emai'), email)

WebUI.setText(findTestObject('Page_Create New Customer Account/input_Sign-in Information_pass'), password)

WebUI.setText(findTestObject('Page_Create New Customer Account/input_No Password_password_con'), password_1)

WebUI.click(findTestObject('Page_Create New Customer Account/button_Create an Account'))

