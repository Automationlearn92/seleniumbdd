package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ConfigReader;
import utils.baseClass;

public class login extends baseClass{
	
	private By userNameLocator = By.name("username");
	private By PasswordLocator = By.name("password");
	private By loginButton = By.xpath("//button[@type='submit']");
	
	protected ConfigReader configReader;
	public login(WebDriver driver) {
		super(driver);
		this.configReader = new ConfigReader();
		// TODO Auto-generated constructor stub
	}

	public void browserOpen() {
		initializeDriver();
		
	}
	
	public void verifyBrowserTitle() {
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
	}
	
	public void enterUserandPwd() throws InterruptedException {
		Thread.sleep(1000);
		findElement(userNameLocator).sendKeys(configReader.getUserName());
		findElement(PasswordLocator).sendKeys(configReader.getPassword());
	    findElement(loginButton).click();
	}

}
