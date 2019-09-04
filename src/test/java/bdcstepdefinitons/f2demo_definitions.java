package bdcstepdefinitons;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class f2demo_definitions {
	@Given("user access the signup page")
	public void user_access_the_signup_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	System.out.println("code for user access the signup page");
	}

	@Given("gets the credentials")
	public void gets_the_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for gets the credentials");
	}

	@Given("user has valid account creds for Demo webshop")
	public void user_has_valid_account_creds_for_Demo_webshop() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for user has valid account creds for Demo webshop");
	}

	@Given("provide the valid creds as inputs for the login process")
	public void provide_the_valid_creds_as_inputs_for_the_login_process() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("provide the valid creds as inputs for the login process");
	}

	@Then("verifies the state for the login status")
	public void verifies_the_state_for_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for verifies the state for the login status ");
	}

}
