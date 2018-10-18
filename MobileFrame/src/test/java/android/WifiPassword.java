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

public class WifiPassword {
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
	//Scenario:  Connect to wifi
	
	//Given I am on the Home screen 
    //When I tap  the 'Preferences'  menu item
    //Then I will tap 'preference dependencies'  
    //When I  tap  the 'Wifi ' option in preference dependencies
    //Then a text box will appear
    //When I type 'hello' 
	//And tap the 'OK' button
    //Then I am connected to wifi
	
	public void addWifi(){
		
		   driver.findElementByXPath("//android.widget.TextView[@text = 'Preference']").click();
		   driver.findElementByXPath("//android.widget.TextView[@text = '3. Preference dependencies']").click();
		   driver.findElementById("android:id/checkbox").click();
		   driver.findElementByClassName("android.widget.TextView").click();
	       driver.findElementByXPath("(//android.widget.RelativeLayout) [2]").click();
		   driver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
		   driver.findElementById("android:id/button1").click();
		   driver.navigate().back();
		   
		   // multiple objects with duplicates class names
		   
		driver.findElementsByClassName("android.widget.Button").get(2).click(); 
		
		}
		
	}
	
	
	
	
	


