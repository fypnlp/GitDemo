package apkDemoPageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

	public class Preferences {
		public Preferences( AndroidDriver driver)
			{

			PageFactory.initElements(new AppiumFieldDecorator (driver), this);
			
			}	
	
	//Preference dependencies 
		
		@AndroidFindBy (xpath= "//android.widget.TextView[@text='3. Preference dependencies'] ")
		public WebElement PreferenceDependencies;
		
		@AndroidFindBy (id= "android:id/checkbox")
		public WebElement WifiCheckbox;
		
		
		@AndroidFindBy (className= "android.widget.TextView")
		public WebElement WifiSettings;
		
		@AndroidFindBy (xpath= "(//android.widget.RelativeLayout)[2]")
		public WebElement ActivateWifiSettings;
		
		@AndroidFindBy (className= "android.widget.EditText")
		public WebElement WifiTextBox;
		
		@AndroidFindBy (id= "android:id/button1")
		public WebElement WifiOKbutton ;
		
		//@AndroidFindBy (id= "android.widget.Button")
		//public List <WebElement> Button  ;
	

}
