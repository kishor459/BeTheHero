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
/*6	"Sign in App with the Login ID
Click on Account Details 
Click on Edit Account
Update Name, Email, Number, City, State Code, 
And click on Update Button
Click on Back
Click on Account Details"	Details edited should be updated successfully */

public class Tc06BeTheHero {
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
		driver.findElement(By.xpath("//android.widget.TextView[@text='Account']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='EDIT']")).click();
		WebElement name=driver.findElement(By.xpath("//android.widget.EditText[@text='Anurag Kashyap singh']"));
		name.clear();
		name.sendKeys("Anurag Kashyap");
		WebElement email= driver.findElement(By.xpath("//android.widget.EditText[@text='kishor9876565@gmail.com']"));
		email.clear();
		email.sendKeys("kkrk87093@gmail.com");
		WebElement whatappno= driver.findElement(By.xpath("//android.widget.EditText[@text='8521685932']"));
		whatappno.clear();
		whatappno.sendKeys("8521685933");
		WebElement city=driver.findElement(By.xpath("//android.widget.EditText[@text='Biharsarif']"));
		city.clear();
		city.sendKeys("Nawada");
		WebElement scode=driver.findElement(By.xpath("//android.widget.EditText[@text='24']"));
		scode.clear();
		scode.sendKeys("23");
		driver.findElement(By.xpath("//android.widget.TextView[@text='UPDATE']")).click();
		System.out.println("Update have been done successfully!");
		
		driver.quit();

}
}
