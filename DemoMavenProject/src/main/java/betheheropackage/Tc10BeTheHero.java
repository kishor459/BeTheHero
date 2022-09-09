package betheheropackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
/*10	"Open the App, Click on New User Signup Link
Enter Name, Email, City, Number, 
And enter state code with three Characters
And Click on Signup"	Validate the Error Text Displayed "Error while signup"*/

public class Tc10BeTheHero {
	public static void main(String[] args) throws MalformedURLException{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator");
		caps.setCapability("avd", "Pixel_4_API_30"); 
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.robinqapitol.bethehero");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "host.exp.exponent.LauncherActivity");
		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='New User - Sign Up']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Name']")).sendKeys("Anand Raj");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Email']")).sendKeys("kkrocks82709@gmail.com");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Mobile']")).sendKeys("8709001266");
		driver.findElement(By.xpath("//android.widget.EditText[@text='City']")).sendKeys("Nawadahh");
		driver.findElement(By.xpath("//android.widget.EditText[@text='State code']")).sendKeys("180");
		driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN UP']")).click();
		String ActualError="Error while signup";
		WebElement Expectederror=driver.findElement(By.id("android:id/message"));
		String ExpectedError=Expectederror.getText();
		if(ActualError.equals(ExpectedError)) {
			System.out.println("Error message is getting displayed as expected");
		}
		else {
		System.out.println("Error message is not getting displayed as expected");
		}
		
		driver.findElement(By.id("android:id/button1")).click();
		driver.quit();
}
}