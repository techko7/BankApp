package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Base;

public class ApplicationTest extends Base {

	@Given("I click on the Applications page")
	public void i_click_on_the_applications_page() {
		driver.findElement(By.linkText("Applications")).click();
	}

	@Given("I click on the Create New View")
	public void i_click_on_the_create_new_view() {
		driver.findElement(By.linkText("Create New View")).click();
	}

	@Then("I enter view_name")
	public void i_enter_view_name() {
		driver.findElement(By.id("fname")).sendKeys("techko7");
	}

	@Then("I hit save")
	public void i_hit_save() {
		driver.findElement(By.name("save")).click();
	}

	@Then("I select the link of {string}")
	public void i_select_the_link_of(String string) {
		driver.findElement(By.linkText(string)).click();
	}

	@Then("I select the checkbox of Stefs Application")
	public void i_select_the_checkbox_of_Stefs_Application() {

		List<WebElement> header = driver
				.findElements(By.xpath("//td[starts-with(@class, 'x-grid3-hd x-grid3-cell x-grid3-td')]"));
		int headerSize = header.size();
		System.out.println(headerSize);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='x-grid3-row-table']"));
		int rowSize = rows.size();
		System.out.println(rowSize);

		List<WebElement> cells = driver.findElements(By.cssSelector("td"));
		int cellSize = cells.size();
		System.out.println(cellSize);

		for (WebElement cell : cells) {
			String cellValue = cell.getText();
			System.out.println(cellValue);
			if (cellValue.equalsIgnoreCase("Application: Stef's Application")) {
				WebElement checkbox = cell.findElement(By.xpath("//input[@type='checkbox']//following-sibling ::td[contains(@class, 'Stef's Application')]"));
				checkbox.click();
				break;
			}

		}
	}

	@Then("select all checkboxes")
	public void select_all_checkboxes() {
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])"));
		checkbox.click();
	}

}
