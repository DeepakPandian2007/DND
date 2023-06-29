package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RahulShetty01 {
	
	@Given("^User is in the Automation Page$")
	public void User_is_in_the_Automation_Page() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	}
	
	@When("User clicks on Radio button {int}")
	public void user_clicks_on_radio_button1(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("User clicks on Radio button {int}")
	public void user_clicks_on_radio_button2(Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User clicks on Radio button {int}")
	public void user_clicks_on_radio_button3(Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	
	@Then("particualr option is selected")
	public void particualr_option_is_selected() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
