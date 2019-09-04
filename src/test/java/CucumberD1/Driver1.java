package CucumberD1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver1 {

	public static WebDriver configureDriver(String browserName) {
		WebDriver driver = null;
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\j.bysani.shekar\\java1\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		  
	}
		else if(browserName.equals("explorer")) {
			System.setProperty("webdriver.ie.driver","C:\\Users\\j.bysani.shekar\\java1\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			  
		}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\j.bysani.shekar\\java1\\geckodriver.exe");
			 driver = new FirefoxDriver();
	
	
	}
	return driver;
}
}
