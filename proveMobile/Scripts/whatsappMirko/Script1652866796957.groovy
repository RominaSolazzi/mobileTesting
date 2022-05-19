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


Mobile.startExistingApplication('com.whatsapp')

driver = MobileDriverFactory.getDriver()

Mobile.tap(findTestObject('Object Repository/ciao mirko/android.widget.TextView - Inlab Group'), 0)

Mobile.tap(findTestObject('Object Repository/ciao mirko/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/ciao mirko/android.widget.TextView - CHAT'), 0)

stato = Mobile.getText(findTestObject('Object Repository/ciao mirko/android.widget.TextView - STATO'), 0)

KeywordUtil.logInfo(stato)

Mobile.verifyMatch(stato, "STATO", false)

Mobile.getText(findTestObject('Object Repository/ciao mirko/android.widget.TextView - CHIAMATE'), 0)

Mobile.getText(findTestObject('Object Repository/ciao mirko/android.widget.TextView - CHAT'), 0)

Mobile.takeScreenshot('C:\\Users\\Romina\\AppData\\Local\\Temp\\screenshot7689534332274986709.png')

Mobile.scrollToText('Mirko')

Mobile.tap(findTestObject('Object Repository/ciao mirko/android.widget.TextView - Mirko'), 0)

Mobile.tap(findTestObject('Object Repository/ciao mirko/android.widget.EditText - Messaggio'), 0)

Mobile.setText(findTestObject('Object Repository/ciao mirko/android.widget.EditText - Messaggio (1)'), 'ciao Pixel3', 0)

Mobile.tap(findTestObject('Object Repository/ciao mirko/android.widget.ImageButton'), 0)

driver.resetApp()



