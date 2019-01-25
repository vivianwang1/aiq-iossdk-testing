package testpac;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Scanner extends BaseScanner {
	

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		IOSDriver<IOSElement> driver = capabilities(); 
	
		driver.findElementByName("Open Scanner").click();
		driver.findElementByName("OK").click();
		driver.findElementByName("Open Scanner").click();
		
	}

}

