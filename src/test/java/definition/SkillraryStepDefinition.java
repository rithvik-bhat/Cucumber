package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class SkillraryStepDefinition {

	WebDriver driver;
	public String URL = "https://demoapp.skillrary.com/login.php?type=login";
	@Given("I should open the browser and navigate to the login page of skillrary")
	public void i_should_open_the_browser_and_navigate_to_the_login_page_of_skillrary() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
	}
//	@When("Enter Username {string}")
//	public void enter_username(String string) {
//		driver.findElement(By.id("email")).sendKeys(string);
//	}
//	@When("Enter Password {string}")
//	public void enter_password(String string) {
//		driver.findElement(By.id("password")).sendKeys(string);
//	}
	@When("Enter Username {string}")
	public void enter_username(String user) {
		driver.findElement(By.id("email")).sendKeys(user);
	}
	@When("Enter Password {string}")
	public void enter_password(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When("Click on the LoginButton")
	public void click_on_the_login_button() {
		driver.findElement(By.id("last")).click();
	}
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String name) {
		String username = driver.findElement(By.xpath("//span[contains(text(),'Harry Den')]")).getText();
	    Assert.assertEquals(username, name);
	    //driver.close();
	}
//	@Then("I should see the username as {string}")
//	public void i_should_see_the_username_as(String string) {
//		String username = driver.findElement(By.xpath("//span[contains(text(),'Harry Den')]")).getText();
//	    Assert.assertEquals(username, string);
//	    //driver.close();
//	}
//	@Then("I should see the admin as {string}")
//	public void i_should_see_the_admin_as(String string) {
//	   String admin = driver.findElement(By.xpath("//*[@class='pull-left info']/p")).getText();
//	   Assert.assertEquals(admin, string);
//	   //driver.close();
//	}
	@Then("I should navigate to the page {string}")
	public void i_should_navigate_to_the_page(String string) {
		String Register = driver.findElement(By.xpath("//*[@class='btnRegister']")).getAttribute("value");
		  Assert.assertEquals(Register, string);
		  //driver.close();
	}

}
