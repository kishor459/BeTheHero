package com.mobile.examples;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BeTheHeroApk {
	public static void main(String[] args) throws MalformedURLException{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A12");
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.robinqapitol.bethehero");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "host.exp.exponent.LauncherActivity");
		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='New User - Sign Up']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Name']")).sendKeys("Kishor Kunal");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Email']")).sendKeys("kkrocks82738@gmail.com");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Mobile']")).sendKeys("8709001244");
		driver.findElement(By.xpath("//android.widget.EditText[@text='City']")).sendKeys("Nawada");
		driver.findElement(By.xpath("//android.widget.EditText[@text='State code']")).sendKeys("21");
		driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN UP']")).click();
		//driver.quit();

}
}
