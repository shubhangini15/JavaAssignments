import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Ebay {
	
	WebDriver driver;
	Screen myScreen;
	JavascriptExecutor jse;
	
	public void invokeBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\Libraries\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        // And now use this to visit Google
        driver.get("http://www.ebay.com");
	}
	
	public void searchHomeOnEbay() {
		try {
			myScreen = new Screen();
			Pattern p1 = new Pattern("");
			Pattern p2 = new Pattern("");
			Pattern p3 = new Pattern("");
			myScreen.wait(p1, 5);
			myScreen.click(p1);
			myScreen.wait(p2, 2);
			myScreen.click(p2);
			Thread.sleep(3000);
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,800)");
			myScreen.click(p3);
		}
		catch(FindFailed e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main (String [] args) {
		Ebay obj = new Ebay();
		obj.invokeBrowser();
		obj.searchHomeOnEbay();
	}
}
