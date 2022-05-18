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

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Maps/android.widget.TextView - No, grazie'), 5, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Object Repository/Maps/android.widget.TextView - Cerca qui'), 5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHold(findTestObject('Object Repository/Maps/android.widget.TextView - Cerca qui'), 0, 0)

Mobile.setText(findTestObject('Object Repository/Maps/android.widget.EditText - Cerca qui'), 'via cristoforo colombo 112',
	0)

Mobile.tap(findTestObject('Object Repository/Maps/android.widget.TextView - Via Cristoforo Colombo, 112'), 0)

String cristoColombo = Mobile.getText(findTestObject('Object Repository/Maps/android.widget.TextView - Via Cristoforo Colombo, 112-automatorui'), 5, FailureHandling.STOP_ON_FAILURE)

KeywordUtil.logInfo('La cosa che hai cercato sul coso è ' + cristoColombo)

Mobile.verifyMatch(cristoColombo, 'Via Cristoforo Colombo, 112', false)

Mobile.tap(findTestObject('Object Repository/Maps/android.view.View - Indicazioni'), 0)

Mobile.tap(findTestObject('Object Repository/Maps/android.widget.TextView - La tua posizione'), 0)

Mobile.setText(findTestObject('Object Repository/Maps/android.widget.EditText - Scegli la posizione iniziale'), 'colosseo',
	0)

Mobile.tap(findTestObject('Object Repository/Maps/android.widget.TextView - Colosseo'), 0)

Mobile.tap(findTestObject('Object Repository/Maps/android.widget.Button - OK'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Maps/android.view.View - Ignora'), 5, FailureHandling.OPTIONAL)

Mobile.scrollToText('Svolta a sinistra e prendi Via Cristoforo Colombo')

//non chiude l'applicazione però
Mobile.closeApplication()