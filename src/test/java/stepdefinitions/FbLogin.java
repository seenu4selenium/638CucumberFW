package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbLogin {
	WebDriver driver;

	@Given("User open ChromeBrowser and type URL")
	public void user_open_chrome_browser_and_type_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@When("user enter invalid UserName and Password")
	public void user_enter_invalid_user_name_and_password() {
		driver.findElement(By.id("email")).sendKeys("dkjfhg564jhfgldsj@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("uoyetwrjndbs78hjb");
	}

	@And("click on Login button")
	public void click_on_login_button() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		Thread.sleep(6000);
	}

	@Then("verify Error message on screen")
	public void verify_error_message_on_screen() {

		if (driver.findElements(By.linkText("Find your account and log in.")).size() > 0
				|| driver.findElements(By.linkText("Create a new Facebook account.")).size() > 0) {
			System.out.println("Error messages is displayed, Given Credentials were invalid");
		} else {
			System.out.println("Error messages is NOT displayed, Given Credentials were valid");
		}
	}

	// When user enter invalid <UserName> and <Password>
	@When("user enter invalid {string} and {string}")
	public void retestingFB(String UserName, String Password) {
		driver.findElement(By.id("email")).sendKeys(UserName);
		driver.findElement(By.name("pass")).sendKeys(Password);
	}
}
