package testpac;

import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Camera extends BaseCamera{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		IOSDriver<IOSElement> driver = capabilities();
		IOSElement ele = driver.findElementByAccessibilityId("Take Picture");
		ele.click();

	}

}