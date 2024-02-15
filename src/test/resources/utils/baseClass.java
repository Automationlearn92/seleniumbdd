package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class baseClass {

	protected static WebDriver driver;
	
	protected ConfigReader configReader;

    public baseClass(WebDriver driver) {
        this.driver = driver;
        this.configReader = new ConfigReader(); // Instantiate ConfigReader
       // initializeDriver(); // Call method to initialize WebDriver
    }

	public static void initializeDriver() {
		if (ConfigReader.getBrowser().contains("Chrome")) {
			System.setProperty("webdriver.edge.driver", ConfigReader.getChromeDriverPath());

			// Create an instance of chromedriver
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.edge.driver", ConfigReader.getChromeDriverPath());

			// Create an instance of EdgeDriver
			driver = new EdgeDriver();
		}
		driver.get(ConfigReader.getUrl());
		driver.manage().window().maximize();

	}

	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	

}
