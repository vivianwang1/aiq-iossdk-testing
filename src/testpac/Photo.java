package testpac;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Photo extends BasePhoto {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		IOSDriver<IOSElement> driver = capabilities(); 
		
		driver.findElementByName("Pick Image").click();
		driver.findElementByAccessibilityId("Photo, HDR, Landscape, March 31, 2018, 3:14 AM").click();

	}

}
