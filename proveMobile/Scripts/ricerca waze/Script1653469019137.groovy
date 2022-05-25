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

Mobile.startExistingApplication('com.waze')

Mobile.getText(findTestObject('Object Repository/waze/android.widget.TextView - Il mio Waze'), 0)

Mobile.getText(findTestObject('Object Repository/waze/android.widget.EditText - Dove andiamo'), 0)

Mobile.tap(findTestObject('Object Repository/waze/android.widget.EditText - Dove andiamo'), 0)

Mobile.setText(findTestObject('Object Repository/waze/android.widget.EditText - Dove andiamo (1)'), 'Via casal selce', 0)

Mobile.getText(findTestObject('Object Repository/waze/android.widget.TextView - Via di Casal Selce'), 0)

Mobile.tap(findTestObject('Object Repository/waze/android.widget.LinearLayout'), 0)

Mobile.getText(findTestObject('Object Repository/waze/android.widget.TextView - Salva luogo'), 0)

Mobile.tap(findTestObject('Object Repository/waze/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/waze/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/waze/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/waze/android.widget.TextView - Aggiungi fermata'), 0)

Mobile.setText(findTestObject('Object Repository/waze/android.widget.EditText - Dove andiamo (2)'), 'via di casalotti', 
    0)

Mobile.closeApplication()

