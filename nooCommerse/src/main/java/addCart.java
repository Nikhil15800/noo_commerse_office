//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addCart {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		String apparelUrl = "https://demo.nopcommerce.com/custom-t-shirt";
		driver.get(apparelUrl);
		
		WebElement text = driver.findElement(By.id("product_attribute_12"));
		text.sendKeys("Hey...");
		
		WebElement btncart = driver.findElement(By.xpath("//button[@class='button-1 add-to-cart-button']"));
		btncart.click();
		
		Thread.sleep(5000);
		
		//Open Shopping cart : 
		WebElement cartLabel = driver.findElement(By.className("cart-label"));
		Actions action = new Actions(driver);
		action.moveToElement(cartLabel).perform();
		Thread.sleep(2000);
		
		WebElement cartBtn = driver.findElement(By.className("button-1 cart-button"));
		cartBtn.click();
		
	}

}
