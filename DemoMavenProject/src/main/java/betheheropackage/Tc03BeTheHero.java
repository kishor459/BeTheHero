package betheheropackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
/*3	"Sign in App with the Login ID
Click on Add Test Cases again 
Enter Title , Description, Value 
Click on Add Case"""	"Validate Title, Description Entered
And validate ""Totally 2 TestCase"" text"*/

public class Tc03BeTheHero {
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
		driver.findElement(By.xpath("//android.widget.EditText[@text='Login id']")).sendKeys("8dfdf126");
		driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Add Case']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Give title']")).sendKeys("BeTheHero Test flow3");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Give description']")).sendKeys("Validate BeTheHero Test Flow3");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Give value']")).sendKeys("3.0");
		driver.findElement(By.xpath("//android.widget.TextView[@text='ADD CASE']")).click();
		driver.quit();
		
}
}
