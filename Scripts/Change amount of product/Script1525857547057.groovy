import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://18.188.77.27:8087/')

WebUI.setText(findTestObject('Change amount of product/Page_ProjectBackend/input_username'), username)

WebUI.setText(findTestObject('Change amount of product/Page_ProjectBackend/input_password'), password)

WebUI.click(findTestObject('Change amount of product/Page_ProjectBackend/button_Login'))

WebUI.click(findTestObject('Change amount of product/Page_ProjectBackend/button_add to cart'))

WebUI.click(findTestObject('Change amount of product/Page_ProjectBackend/a_Carts            1'))

WebUI.setText(findTestObject('Change amount of product/Page_ProjectBackend/input_amount'), amount)

WebUI.click(findTestObject('Change amount of product/Page_ProjectBackend/button_confirm'))

WebUI.acceptAlert()

WebUI.verifyElementText(findTestObject('Change amount of product/Page_ProjectBackend/div_Well done You successfully'), 'Well done! You successfully added the transaction.')

WebUI.closeBrowser()

