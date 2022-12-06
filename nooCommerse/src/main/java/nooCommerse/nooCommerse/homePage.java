package nooCommerse.nooCommerse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class homePage {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		String webUrl= "https://demo.nopcommerce.com/";
		driver.get(webUrl);
		
		
		// Register click : 
//		WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
		WebElement register = driver.findElement(By.className("ico-register"));
		register.click();

	}
}
