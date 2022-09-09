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
//8	Enter SignIn with invalid ID	Validate the Error Text Displayed "Error while signin"

public class Tc08BeTheHero {
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
		driver.findElement(By.xpath("//android.widget.EditText[@text='Login id']")).sendKeys("729522be");
		driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']")).click();
		String ActualError="Error while signin";
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
