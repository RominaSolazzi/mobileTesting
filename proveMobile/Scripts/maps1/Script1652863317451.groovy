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
Mobile.startExistingApplication('com.google.android.apps.maps')

driver = MobileDriverFactory.getDriver()

Mobile.tap(findTestObject('Object Repository/maps casal selce/android.widget.TextView - Cerca qui'), 0)

Mobile.tap(findTestObject('Object Repository/maps casal selce/android.widget.EditText - Cerca qui'), 0)

Mobile.setText(findTestObject('Object Repository/maps casal selce/android.widget.EditText - Cerca qui'), 'via casal selce 385', 0)

Mobile.tap(findTestObject('Object Repository/maps casal selce/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/maps casal selce/android.view.View'), 2)

Mobile.delay(5)

Mobile.scrollToText('elenco di negozi')

Mobile.tap(findTestObject('Object Repository/maps casal selce/android.widget.RelativeLayout'), 0)

Mobile.getText(findTestObject('Object Repository/maps casal selce/android.widget.TextView - Aperto  Chiude alle ore 21'),
	0)

Mobile.tap(findTestObject('Object Repository/maps casal selce/android.view.View - Indicazioni'), 0)

Mobile.tap(findTestObject('Object Repository/maps casal selce/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/maps casal selce/android.widget.TextView - PERCORSO CONSIGLIATO'), 0)

Mobile.getText(findTestObject('Object Repository/maps casal selce/android.widget.TextView - PERCORSO CONSIGLIATO'), 0)

Mobile.tap(findTestObject('Object Repository/maps casal selce/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/maps casal selce/android.view.View - Ignora'), 0)

Mobile.getText(findTestObject('Object Repository/maps casal selce/android.widget.TextView - Posizione iniziale'), 0)

driver.resetApp()

Mobile.closeApplication()


