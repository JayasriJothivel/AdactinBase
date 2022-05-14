package com.lipglobal;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;
	
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public void launchUrl(String Url) {
		driver.get(Url);
	}
	
	public void winMaximize() {
		driver.manage().window().maximize();
	}
	
	public void waitsImplicit() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	
	public void sendValue(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public void elementClick(WebElement element) {
		element.click();
	}
	
	public String currentUrl() {
		 return driver.getCurrentUrl();
	}
	
	public String elementText(WebElement element) {
		return element.getText();
	}
	
	public String elementValue(WebElement element) {
		return element.getAttribute("Value");
	}
	public void quitBrowser() {
		driver.quit();
	}
	public void closeBrowser() {
		driver.close();
	}
}
