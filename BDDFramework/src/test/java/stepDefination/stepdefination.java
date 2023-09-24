package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefination {

	WebDriver driver;
	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
	    System.out.println("Demo");
	}

	@When("I submit username and password")
	public void i_submit_username_and_password() {
		 System.out.println("Demo");
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
		 System.out.println("Demo");
	}

	@Given("User launches browser")
	public void user_launches_browser() {
		 System.out.println("Demo");
	}

	@When("User open application URL")
	public void user_open_application_url() {
		 System.out.println("Demo");
	}

	@When("User enter {string}")
	public void user_enter(String string) {
		 System.out.println("Demo");
	}

	@When("User click on login button")
	public void click_on_login_button() {
		 System.out.println("Demo");
	}

	@Then("User should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
		 System.out.println("Demo");
	}

	@Given("launch browser")
	public void launch_browser() {
	    driver = new ChromeDriver();
	   
	}

	@Given("open application url")
	public void open_application_url() {
	   driver.get("https://login.salesforce.com/?locale=in");
	}

	@When("user Enter username")
	public void user_enter_username() {
	    
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rashmi");
	}

	@When("user enter password")
	public void user_enter_password() {
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("Rshmi123");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}

	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
	    
		System.out.println("Login succesfully");
	}

}
