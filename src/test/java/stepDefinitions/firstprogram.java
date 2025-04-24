package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class firstprogram {

		// TODO Auto-generated method stub
	
	@Given("Setup the entries in database")
	public void setup_the_entries_in_database() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Setup the entries in database");
	}
	@When("Launch the browser from config variables")
	public void launch_the_browser_from_config_variables() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Launch the browser from config variables");
	}
	@When("hit the home page url of banking site")
	public void hit_the_home_page_url_of_banking_site() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hit the home page url of banking site");
	}
	
	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on NetBanking landing page executes before every scenario");
	}
	@When("User login into application")
	public void user_login_into_application() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("Card are displayed")
	public void card_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User login into application with username (.+) and password (.+)$")
	public void user_login_into_application_with_username_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("username is:"+username+" and password is:"+password);
	    System.out.println("Test Git Push");
	}

}
