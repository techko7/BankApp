package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Base;

public class LoginTest extends Base {

	@Given("I open chrome browser")
	public void i_open_chrome_browser() {
		openBrowser();
	}

	@Given("I visit the environment")
	public void i_visit_the_environment() {
		driver.get("https://login.salesforce.com");
	}

	@When("I enter username")
	public void i_enter_username() {
		driver.findElement(By.id("username")).sendKeys("john@codegator.us");
	}

	@Then("I enter pwd")
	public void i_enter_pwd() {
		driver.findElement(By.id("password")).sendKeys("Welcome2");
	}

	@Then("I click on the login button")
	public void i_click_on_the_login_button() throws InterruptedException {
		driver.findElement(By.id("Login")).click();
		Thread.sleep(9000);
	}

	@Then("I should see Home page")
	public void i_should_see_home_page() {
		boolean present = driver.findElement(By.linkText("Home")).isDisplayed();
		Assert.assertTrue(present);
	}

}
