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

import com.detroitlabs.katalonmobileutil.touch.Scroll
import com.detroitlabs.katalonmobileutil.touch.Scroll.ScrollFactor
import com.detroitlabs.katalonmobileutil.touch.Swipe

Mobile.startExistingApplication('it.feltrinelli')

Mobile.tap(findTestObject('Object Repository/la feltrinelli-Ricerca/android.widget.Button - Cerca'), 0)

Mobile.tap(findTestObject('Object Repository/la feltrinelli-Ricerca/android.widget.TextView - harry potter'), 0)

//Mobile.scrollToText('Dobble Harry Potter')
'Get Device Height and Store in device_height variable'

device_Height = Mobile.getDeviceHeight()



'Get Width Height and Store in device_Width variable'

device_Width = Mobile.getDeviceWidth()


String id = "it.feltrinelli:id/titleText"
String text = "Pictionary Air Harry Potter gioco di disegni per famiglie; dagli 8 anni in su"

int timeout = 0

search()

Mobile.closeApplication()

def search() {
	try {
		//Mobile.scrollToText('Pictionary Air Harry Potter gioco di disegni per famiglie; dagli 8 anni in su', FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyElementVisible(findTestObject('Object Repository/la feltrinelli-Ricerca/android.widget.TextView - harry potter - Copy'), 2)
		//
	} catch(e) {
		Swipe.swipe(Swipe.SwipeDirection.BOTTOM_TO_TOP);
		
		search()
		
		/*'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
		
		int startX = device_Width / 2
		
		
		
		'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
		
		int endX = startX
		
		
		
		'Storing the startY value'
		
		int startY = device_Height * 0.30
		
		
		
		'Storing the endY value'
		
		int endY = device_Height * 0.70
		
		
		
		'Swipe Vertical from top to bottom'
		
		Mobile.swipe(startX, endY, endX, startY)
		search()*/
	}
}
