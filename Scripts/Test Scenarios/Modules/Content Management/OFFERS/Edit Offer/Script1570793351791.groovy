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
import org.openqa.selenium.Keys as Keys

not_run: WebUI.click(findTestObject('Edit Offer/Page_Dashboard/div_Content'))

not_run: WebUI.click(findTestObject('Create Offer/Page_Templates/a_Offers'))

WebUI.click(findTestObject('Edit Offer/hamburger'))

WebUI.click(findTestObject('Edit Offer/Page_Offers/edit'))

WebUI.click(findTestObject('Edit Offer/Page_Offers/button_Yes Edit'))

WebUI.click(findTestObject('Create Offer/Page_Offers/radiobutton_Retention'))

WebUI.click(findTestObject('Object Repository/Edit Offer/Page_Offers/button_Next'))

WebUI.click(findTestObject('Object Repository/Edit Offer/Page_Offers/button_Make Active'))

WebUI.click(findTestObject('Object Repository/Edit Offer/Page_Offers/button_Yes Make Active'))

