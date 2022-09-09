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
/*5	"Sign in App with the Login ID
Click on Account Details "	Validate Signup details are matching with the account details
*/

public class Tc05BeTheHero {
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
		String actualID="729522bf";
		WebElement id= driver.findElement(By.xpath("//android.widget.EditText[@text='729522bf']"));
		String iddetails=id.getText();
		if(actualID.equals(iddetails)) {
			System.out.println("ID is getting displayed as expected");
		}
		else {
			System.out.println("ID is not getting displayed as expected");
		}
		String ActualName="Anurag Kashyap";
		WebElement expectedname=driver.findElement(By.xpath("//android.widget.EditText[@text='Anurag Kashyap singh']"));
		String ExpectedUname=expectedname.getText();
		if(ActualName.equals(ExpectedUname)) {
			System.out.println("Name  is getting displayed as expected");
		}
		else {
			System.out.println("Name  is  not getting displayed as expected");
		}
			
		String Actualemail="kkrocks827381@gmail.com";
		WebElement email1= driver.findElement(By.xpath("//android.widget.EditText[@text='kishor9876565@gmail.com']"));
		String ExpectedEmail=email1.getText();
		if(Actualemail.equals(ExpectedEmail)) {
			System.out.println("Email  is getting displayed as expected");
		}
		else {
			System.out.println("Email  is not getting displayed as expected");
		}
		String Actualno="8521685932";
		WebElement ExpectedNo=driver.findElement(By.xpath("//android.widget.EditText[@text='8521685932']"));
		String Expectedwhatapp=ExpectedNo.getText();
		if(Actualno.equals(Expectedwhatapp)) {
			System.out.println("Whatapp No  is getting displayed as expected");	
		}
		else {
			System.out.println("Whatapp No  is not  getting displayed as expected");
		}
		String ActualCity="Biharsarif";
		WebElement cityname=driver.findElement(By.xpath("//android.widget.EditText[@text='Biharsarif']"));
		String Expectedcity=cityname.getText();
		if(ActualCity.equals(Expectedcity)) {
			System.out.println("City Name  is getting displayed as expected");	
		}
		else {
			System.out.println("City Name   is not  getting displayed as expected");	
		}
		String Actualscode="24";
		WebElement scode=driver.findElement(By.xpath("//android.widget.EditText[@text='24']"));
		String Expectedscode=scode.getText();
		if(Actualscode.equals(Expectedscode)) {
			System.out.println("State code  is getting displayed as expected");
		}
		else {
			System.out.println("State code  is not  getting displayed as expected");
		}
		driver.quit();
		
		
}
}
