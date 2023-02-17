package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JRIlogin {
	WebDriver driver;

	@Given("Open JRI app using ChromeBrowser")
	public void open_jri_app_using_chrome_browser() {
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.manage().window().maximize();
	}

	@When("User type invalid credentisla")
	public void user_type_invalid_credentisla() {
		driver.findElement(By.name("txtUserName")).sendKeys("adfadsfdf@dsgds.com");
		driver.findElement(By.name("txtPasswd")).sendKeys("9845hjom");
		driver.findElement(By.name("txtCaptcha")).sendKeys("985");
	}

	@And("Click on SecureSignin button")
	public void click_on_secure_signin_button() throws Exception {
		driver.findElement(By.name("imgbtnSignin")).click();
		Thread.sleep(6000);
	}

	@Then("verify ErrorMessage")
	public void verify_error_message() {
		// Verify ErrorMessage
		if (driver.findElements(By.id("MessageCaption4")).size() > 0) {
			System.out.println("Error message displayed");
		} else {
			System.out.println("Error message NOT displayed");
		}
	}
}
