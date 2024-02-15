package stepdefinition;

import io.cucumber.java.en.*;
import pages.login;
import utils.baseClass;

public class loginSteps extends baseClass{
	
	login loginPage;
	
	public loginSteps() {
		super(driver);
		loginPage = new login(driver);
	}
	
	
	@Given("^user launch the browser$")
	public void launchBrowser() {
		loginPage.browserOpen();
	}
	
	@When("^user verifies title of the browser$")
	public void verifyTtile() {
		loginPage.verifyBrowserTitle();
	}
	
	@When("^user login the orangehrm application$")
	public void entersCredentials() throws InterruptedException {
		loginPage.enterUserandPwd();
	}

}
