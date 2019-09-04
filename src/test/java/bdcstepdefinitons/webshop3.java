package bdcstepdefinitons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CucumberD1.Driver1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class webshop3 {
	WebDriver driver;
	@Given("I am launching the webshop url")
	public void i_am_launching_the_webshop_url() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver=Driver1.configureDriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
	}

	@Then("I will check on Login")
	public void i_will_check_on_Login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/login']")).click();
	}

	@When("I enter username{string} and password {string}")
	public void i_enter_username_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(string2);
	}

	@When("click on submit button")
	public void click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("verify for user account status")
	public void verify_for_user_account_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Verified");
	}


}
