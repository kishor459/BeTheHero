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
/*4	"Sign in App with the Login ID
Click on View More Details of First Test Cases"	Validate Whatsapp and Email button should be displayed */

public class Tc04BeTheHero {
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
		driver.findElement(By.xpath("//android.widget.EditText[@text='Login id']")).sendKeys("729522bf");
		driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='View more details']")).click();
	    WebElement whatapp=driver.findElement(By.xpath("//android.widget.TextView[@text='WhatsApp']"));
	
	    System.out.println(whatapp.getText());
	
	
		WebElement email=driver.findElement(By.xpath("//android.widget.TextView[@text='E-mail']"));
		System.out.println(email.getText());
		driver.quit();
}
	
}