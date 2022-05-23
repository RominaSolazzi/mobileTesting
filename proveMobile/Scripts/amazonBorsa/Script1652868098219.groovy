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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.detroitlabs.katalonmobileutil.touch.Scroll
import com.detroitlabs.katalonmobileutil.touch.Scroll.ScrollFactor

Mobile.startExistingApplication('com.amazon.mShop.android.shopping')

driver = MobileDriverFactory.getDriver()

Mobile.tap(findTestObject('Object Repository/amazon borsa/android.widget.TextView - Se accetti, utilizzeremo i cookie anche per ottimizzare la tua esperienza di acquisto nei negozi Amazon come descritto nella nostra'), 
    5, FailureHandling.OPTIONAL)

cart = Mobile.getText(findTestObject('Object Repository/amazon borsa/android.widget.TextView - 0'), 0)

Mobile.tap(findTestObject('Object Repository/amazon borsa/android.widget.TextView - Cerca su Amazon.it'), 0)

Mobile.setText(findTestObject('Object Repository/amazon borsa/android.widget.EditText - Cerca su Amazon.it'), 'borsa', 0)

Mobile.delay(3)

Mobile.scrollToText('borsa donna')
 
Mobile.tap(findTestObject('Object Repository/amazon borsa/android.widget.TextView - borsa donna'), 0)

Mobile.getText(findTestObject('Object Repository/amazon borsa/android.widget.TextView - RISULTATI Il prezzo e altri dettagli possono variare in base alle dimensioni e al colore del prodotto'), 
    0)

Mobile.scrollToText('Desigual')

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/amazon borsa/android.view.View-Desigual'),
	0)

Mobile.scrollToText('Aggiungi al carrello')

Mobile.tap(findTestObject('Object Repository/amazon borsa/android.widget.Button - Aggiungi al carrello'), 0)

addcart = Mobile.getText(findTestObject('Object Repository/amazon borsa/android.widget.TextView - 1'), 0)

Mobile.verifyNotMatch(cart, addcart, false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/amazon borsa/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('Object Repository/amazon borsa/android.widget.Button - Rimuovi'), 0)

Mobile.delay(3)

Mobile.scrollToText('borsa donna')

Mobile.tap(findTestObject('Object Repository/amazon borsa/android.widget.TextView - borsa donna-barra ricerca'), 0)

Mobile.setText(findTestObject('Object Repository/amazon borsa/android.widget.EditText - borsa donna'), '', 0)

Mobile.tap(findTestObject('Object Repository/amazon borsa/android.widget.ImageView-closeBorsa'), 0)

Mobile.tap(findTestObject('Object Repository/amazon borsa/android.widget.ImageView-Freccia'), 0)

Mobile.pressHome()

driver.resetApp()

