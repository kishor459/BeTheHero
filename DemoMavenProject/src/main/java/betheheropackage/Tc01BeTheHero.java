package betheheropackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

/*1	"Open the App, Click on New User Signup Link
Enter Name, Email, Phone, City , StateCode.
Click on Signup.

Note: State Code Must be Two Digits"	"Validate Signup success, Dash board page should be displayed.  
Validate the ""Name"" displayed
Click on Account Details, take the ID, and Store it for Signup for Later Purpose
Logout the app"*/
public class Tc01BeTheHero {
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
		driver.findElement(By.xpath("//android.widget.EditText[@text='Name']")).sendKeys("Valmeekia singh");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Email']")).sendKeys("kkrocks8291@gmail.com");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Mobile']")).sendKeys("8709001276");
		driver.findElement(By.xpath("//android.widget.EditText[@text='City']")).sendKeys("Shekhpuraba");
		driver.findElement(By.xpath("//android.widget.EditText[@text='State code']")).sendKeys("25");
		driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN UP']")).click();
		driver.findElement(By.id("android:id/button1")).click();
		WebElement Username = driver.findElement(By.xpath("//android.widget.TextView[@text='Valmeekia singh']"));
		System.out.println(Username.getText());
		driver.findElement(By.xpath("//android.widget.TextView[@text='Account']")).click();
		//driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebElement idtext= driver.findElement(By.xpath("//android.widget.EditText[@text='729522bf']"));
		//System.out.println(idtext.getText());
		//driver.findElement(By.xpath("//android.widget.TextView[@text='EDIT']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Logout']")).click();
		driver.quit();

}
}
