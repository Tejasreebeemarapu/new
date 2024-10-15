package Step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class test2 {
	@Given("user navigates on to website")
	public void user_navigates_on_to_website() {
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
		 System.out.println("hello");
		
	  
	}
	@Then("user enters  {string} username and {string} password")
	public void user_enters_username_and_password(String string, String string2) {
	    
	}

	@Then("user clicks on login")
	public void user_clicks_on_login() {
		 System.out.println("clicks login");
		
	  
	}

	

	@Then("user validates captcha image")
	public void user_validates_captcha_image() {
	}
	@Then("User naviagtes to homepage")
	public void user_naviagtes_to_homepage() {
	   
		 System.out.println("homepage");
		
	   
	}


}
