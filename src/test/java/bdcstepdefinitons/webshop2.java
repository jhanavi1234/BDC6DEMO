package bdcstepdefinitons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import CucumberD1.Driver1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class webshop2 {
	WebDriver driver;
	@Given("Configurations of the browser and the Application is launched by the user")
	public void configurations_of_the_browser_and_the_Application_is_launched_by_the_user() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver=Driver1.configureDriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
	}

	@Given("bdcs user having valid creds")
	public void bdcs_user_having_valid_creds() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/login']")).click();
	}

	@Then("users tries to provide the data for the login process")
	public void users_tries_to_provide_the_data_for_the_login_process() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("j.bysani@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password123");
	}

	@Then("clicks on Login")
	public void clicks_on_Login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("C");
		
	}

	@Given("BDCs user enters Camera in search tab")
	public void bdcs_user_enters_Camera_in_search_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//Actions act = new Actions(driver);
		//WebElement search1=driver.findElement(By.xpath("//input[@type='text']"));
		//act.sendKeys("C").pause(3000).sendKeys("e").pause(3000).sendKeys("a").pause(3000).sendKeys("r").perform();
				//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Camera");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@href='/digital-downloads']")).click();
		//driver.findElement(By.xpath("//a[@href='/computing-and-internet']")).click();
				
		
	}

	@Then("users selects the products")
	public void users_selects_the_products() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//driver.findElement(By.xpath("//span[@class='price actual-price']")).click();
		driver.findElement(By.xpath("//a[@href='/album-3']")).click();
	}

	@Then("users adds products to the cart")
	public void users_adds_products_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//driver.findElement(By.xpath("//input[@id='add-to-cart-button-18']")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-53']")).click();
	}

	@Given("BDCs user enters Notebook in search tab and adds products to the carts")
	public void bdcs_user_enters_Notebook_in_search_tab_and_adds_products_to_the_carts() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		driver.findElement(By.xpath("//a[@href='/computing-and-internet']")).click();
				
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-13']")).click();
	}


}
