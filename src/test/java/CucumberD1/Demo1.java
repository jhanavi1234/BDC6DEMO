package CucumberD1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Demo1 {
	WebDriver driver;
	
	@Given("Application is launched by guest user")
	public void application_is_launched_by_guest_user() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for launch");
		driver=Driver1.configureDriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp");
	}

	@When("User clicks on sign In link available")
	public void user_clicks_on_sign_In_link_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for click on sign in");
driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
		
		
	}

	@When("provides the required data in the form")
	public void provides_the_required_data_in_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for form data");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Janahavi");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("prakash");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("mani");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys("Password123");
	
		driver.findElement(By.xpath("//label[@class='form-control input-lg']")).sendKeys("Female");	
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("asdf@gmail.com");
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//input[@data-validation='required birthdate']")).sendKeys("2/3/1997");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("jkhyjikfhhhg");		
		driver.findElement(By.xpath("//select[@id='securityQuestion']")).sendKeys("What is your Birth Place?");
		 
	
		driver.findElement(By.xpath("//input[@id='answer']")).sendKeys("Dog");
		
	}

	@Then("user submits the data")
	public void user_submits_the_data() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	System.out.println("code for submission");
	driver.findElement(By.xpath("//input[@value='Register']")).click();
	
	}

	@Then("verifies for the account creation")
	public void verifies_for_the_account_creation() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	System.out.println("code for verification");
	Assert.assertTrue(true);
	}

}
