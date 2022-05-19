import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.apache.commons.lang.RandomStringUtils
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('it.feltrinelli')

driver = MobileDriverFactory.getDriver()

Mobile.tap(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.TextView - Registrati'), 0)

Mobile.tap(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.EditText - Email'), 0)

def email = RandomStringUtils.randomAlphabetic(10).toLowerCase() + '@putsbox.com'

Mobile.setText(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.EditText - Email (1)'), email, 
    0)

Mobile.tap(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.EditText - Password (min 8 caratteri)'), 
    0)

Mobile.setText(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.EditText - Password (min 8 caratteri)'), 'Mypassword1', 0)

Mobile.tap(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.EditText - Ripeti Password'), 0)

Mobile.setText(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.EditText - Ripeti Password'), 'Mypassword1', 0)

Mobile.scrollToText('Questa casella indica che ho letto e accettato')

Mobile.tap(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.RadioButton - Si'), 0)

Mobile.scrollToText('Desidero ricevere buoni sconto, offerte speciali, essere informato su promozioni e novità finalità marketing ')

Mobile.tap(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.RadioButton - Si (1)'), 0)

Mobile.scrollToText('Desidero ricevere offerte personalizzate in linea con le mie preferenze e abitudini di acquisto. Finalità di profilazione')

Mobile.tap(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.RadioButton - No'), 0)

Mobile.scrollToText('Si, desidero accedere a promozioni e iniziative vantaggiose dei partner')

Mobile.tap(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.RadioButton - No (1)'), 0)

Mobile.tap(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.Button - Avanti'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.EditText - Email (2)'), 0)

Mobile.setText(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.EditText - Email (3)'), email, 
    0)

Mobile.tap(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.EditText - Password (1)'), 
    'Mypassword1', 0)

Mobile.tap(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.Button - ACCEDI'), 0)

Mobile.tap(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.Button - Mai'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.TextView - Ciao'), 0)

Mobile.getText(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.TextView - I miei ordini'), 
    0)

Mobile.getText(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.TextView - Ciao'), 0)

Mobile.tap(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.ImageView-omino'), 0)

Mobile.tap(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.ImageButton-exit'), 0)

Mobile.tap(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.Button - CONFERMAEXT'), 0)

Mobile.getText(findTestObject('Object Repository/La feltrinelli registrazione/android.widget.Button - ACCEDI_AfterLogout'), 0)

driver.resetApp()



