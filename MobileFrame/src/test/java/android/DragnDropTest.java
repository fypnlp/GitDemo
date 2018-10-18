package android;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DragnDropTest {
static AndroidDriver<MobileElement> driver;
	
	@BeforeTest
	public AndroidDriver<MobileElement> initDriver() throws MalformedURLException{
		
		
		DesiredCapabilities caps =new DesiredCapabilities();
		caps.setCapability("deviceName", "JacquelineNexus5");
	    caps.setCapability("platformName", "Android");
	    caps.setCapability("platformVersion", "8.0");
	    caps.setCapability("automationName", "UiAutomator2");
	    caps.setCapability("appPackage", "com.example.android.apis");
	    caps.setCapability("appActivity", "ApiDemos");
	    caps.setCapability("newCommandTimeout", "2000");
	    
	    driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
	}
	
	
	@Test 
	//Scenario:  Perform Drag n drop function
	
	//Given I am on the Home screen 
    //When I  tap  the 'Views'  menu item
    //Then I will see the Views menu 
    //When I am in the 'view menu' I will select 'drag n drop'
    //Then I will see 4 dots in the drag n drop page
    //When  I select the 1st dot and drag it
    //Then I will drop it on to the dot below
	
	public void DragAndDrop(){
		
		// tap Views  from main menu 
		driver.findElementsById("android:id/text1").get(11).click();
	
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	
		//click on drag and drop menu
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		
		TouchAction t = new TouchAction (driver);

		t.longPress(driver.findElementsByClassName("android.view.View").get(0)).
		moveTo(driver.findElementsByClassName("android.view.View").get(2)).release().perform();
		
		}
		
	}
	
	
	
	
	


