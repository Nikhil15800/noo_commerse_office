import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clothing_itemChoose {
	public static String browser = "chrome";
	public static WebDriver driver;
	public static void main(String[] args) {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		String itemUrl = "https://demo.nopcommerce.com/clothing";
		driver.get(itemUrl);
		
		// Add to WishList : 
		WebElement wishlist = driver.findElement(By.xpath("//button[@class='button-2 add-to-wishlist-button']"));
		wishlist.click();
		
		// Open new item : 
		WebElement btnclick = driver.findElement(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']"));
		btnclick.click();
	}

}
