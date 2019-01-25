package testpac;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseScanner {

	public static IOSDriver<IOSElement> capabilities() throws MalformedURLException {
		
		IOSDriver<IOSElement> driver;
		
		File f = new File("src");
		File fs = new File(f, "AIQKit-Scanner.app"); 
		
		DesiredCapabilities d = new DesiredCapabilities();
		
		d.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		
		d.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		d.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		d.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.1");
		//
		d.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		
		d.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		
		d.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),d);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
	}
}
