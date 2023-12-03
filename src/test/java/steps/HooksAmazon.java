package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HooksAmazon {
	
	@Given("User is on Main Page")
	public void user_is_on_main_page() {
		
		System.out.println("User is on the main page");
	   
	}

	@Then("User Enters username")
	public void user_enters_username() {
	   
		BaseAmazon.driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9600420995");
		
	}

	@Then("User clicks on continue")
	public void user_clicks_on_continue() {
		
		BaseAmazon.driver.findElement(By.xpath("//input[@id='continue']")).click();
	   
	}

	@Then("User Enters password")
	public void user_enters_password() {
		
		BaseAmazon.driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Admin@1234");
	   
	}

	@Then("User clicks on sign in")
	public void user_clicks_on_sign_in() {
		
		BaseAmazon.driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	    
	}

}
