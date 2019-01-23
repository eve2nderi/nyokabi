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

WebUI.click(findTestObject('Page_Shop Online in Kenya - Pay Con/lnk_Sign In'))

WebUI.setText(findTestObject('Page_Customer Login/input_Email'), email)

WebUI.setText(findTestObject('Page_Customer Login/input_password'), password)

WebUI.click(findTestObject('Page_Customer Login/Page_Customer Login/button_Sign In'), FailureHandling.STOP_ON_FAILURE)
