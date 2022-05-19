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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

Mobile.startExistingApplication('com.amazon.mShop.android.shopping')

driver = MobileDriverFactory.getDriver()

cart = Mobile.getText(findTestObject('Object Repository/amazon borsa/android.widget.TextView - 0'), 0)

KeywordUtil.logInfo(cart)

if(cart == '0') {

Mobile.tap(findTestObject('Object Repository/amazon scarpe/android.widget.TextView - Cerca su Amazon.it'), 0)

Mobile.setText(findTestObject('Object Repository/amazon scarpe/android.widget.EditText - Cerca su Amazon.it'), 'scarpe', 
    0)

Mobile.tap(findTestObject('Object Repository/amazon scarpe/android.widget.LinearLayout'), 0)

Mobile.scrollToText('SUPERGA')

Mobile.tap(findTestObject('Object Repository/amazon scarpe/android.widget.Image - SUPERGA 2750 Cotu Classic, Sneaker Unisex-Adulto'), 
    0)
Mobile.delay(5)


Mobile.tap(findTestObject('Object Repository/amazon scarpe/android.widget.Button - 35.5 EU'), 0)

Mobile.delay(5)

Mobile.scrollToText('Aggiungi al carrello')

Mobile.tap(findTestObject('Object Repository/amazon scarpe/android.widget.Button - Aggiungi al carrello'), 0)

Mobile.delay(5)

addcart = Mobile.getText(findTestObject('Object Repository/amazon borsa/android.widget.TextView - 1'), 0)

Mobile.verifyNotMatch(cart, addcart, false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/amazon scarpe/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/amazon scarpe/android.widget.Button - Rimuovi'), 0)

emptyCart = Mobile.getText(findTestObject('Object Repository/amazon borsa/android.widget.TextView - 0'), 0)

Mobile.verifyMatch(emptyCart, cart, false, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('scarpe uomo')

Mobile.tap(findTestObject('Object Repository/amazon scarpe/android.widget.TextView - scarpe uomo'), 0)

Mobile.setText(findTestObject('Object Repository/amazon scarpe/android.widget.EditText - scarpe uomo'), ' ', 0)

Mobile.tap(findTestObject('Object Repository/amazon scarpe/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/amazon scarpe/android.widget.ImageView (2)'), 0)
}else {
	Mobile.tap(findTestObject('Object Repository/amazon scarpe/android.widget.ImageView'), 0)
	
	Mobile.tap(findTestObject('Object Repository/amazon scarpe/android.widget.Button - Rimuovi'), 0)
	
	emptyCart = Mobile.getText(findTestObject('Object Repository/amazon borsa/android.widget.TextView - 0'), 0)
	
	Mobile.verifyMatch(emptyCart, cart, false, FailureHandling.STOP_ON_FAILURE)
	
	Mobile.scrollToText('scarpe uomo')
	
	Mobile.tap(findTestObject('Object Repository/amazon scarpe/android.widget.TextView - scarpe uomo'), 0)
	
	Mobile.setText(findTestObject('Object Repository/amazon scarpe/android.widget.EditText - scarpe uomo'), ' ', 0)
	
	Mobile.tap(findTestObject('Object Repository/amazon scarpe/android.widget.ImageView (1)'), 0)
	
	Mobile.tap(findTestObject('Object Repository/amazon scarpe/android.widget.ImageView (2)'), 0)
}

driver.resetApp()


