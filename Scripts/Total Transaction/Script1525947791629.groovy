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

WebUI.setText(findTestObject('Total Transaction/Page_ProjectBackend/input_username'), username)

WebUI.setText(findTestObject('Total Transaction/Page_ProjectBackend/input_password'), password)

WebUI.click(findTestObject('Total Transaction/Page_ProjectBackend/button_Login'))

WebUI.click(findTestObject('Total Transaction/Page_ProjectBackend/a_Total Transaction'))

WebUI.click(findTestObject('Total Transaction/Page_ProjectBackend/TableId1'))

WebUI.click(findTestObject('Total Transaction/Page_ProjectBackend/td_Garden Papaya'))

WebUI.click(findTestObject('Total Transaction/Page_ProjectBackend/td_20120 THB'))

WebUI.click(findTestObject('Total Transaction/Page_ProjectBackend/TableId2'))

WebUI.click(findTestObject('Total Transaction/Page_ProjectBackend/td_Banana Garden Banana Rambut'))

WebUI.click(findTestObject('Total Transaction/Page_ProjectBackend/td_60570 THB'))

WebUI.click(findTestObject('Total Transaction/Page_ProjectBackend/TableId3'))

WebUI.click(findTestObject('Total Transaction/Page_ProjectBackend/td_Garden'))

WebUI.click(findTestObject('Total Transaction/Page_ProjectBackend/td_60000 THB'))

WebUI.verifyElementText(findTestObject('Total Transaction/Page_ProjectBackend/TableId1'), '1')

WebUI.verifyElementText(findTestObject('Total Transaction/Page_ProjectBackend/td_Garden Papaya'), 'Garden, Papaya')

WebUI.verifyElementText(findTestObject('Total Transaction/Page_ProjectBackend/td_20120 THB'), '20,120 THB')

WebUI.verifyElementText(findTestObject('Total Transaction/Page_ProjectBackend/TableId2'), '2')

WebUI.verifyElementText(findTestObject('Total Transaction/Page_ProjectBackend/td_Banana Garden Banana Rambut'), 'Banana, Garden, Banana, Rambutan')

WebUI.verifyElementText(findTestObject('Total Transaction/Page_ProjectBackend/td_60570 THB'), '60,000 THB')

WebUI.verifyElementText(findTestObject('Total Transaction/Page_ProjectBackend/TableId3'), '3')

WebUI.verifyElementText(findTestObject('Total Transaction/Page_ProjectBackend/td_Garden'), 'Garden')

WebUI.verifyElementText(findTestObject('Total Transaction/Page_ProjectBackend/td_60000 THB'), '60,570 THB')

WebUI.closeBrowser()

