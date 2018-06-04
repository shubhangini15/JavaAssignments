/*http://www.automationtestinghub.com/selenium-3-0-launch-firefox-with-geckodriver/
 * 
 * How things worked before GeckoDriver and Selenium 3
 * If you are new to Selenium and you have started directly with Selenium 3.x, you would not know
 * how Firefox was launched with the previous versions of Selenium (version 2.53 and before). 
 * It was a pretty straight forward process where you were not required to use GeckoDriver or any 
 * other driver. After you download and install Selenium, you just write the code to instantiate 
 * the WebDriver and open Firefox. 
 * */

package com.seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Libraries\\geckodriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	}
}
