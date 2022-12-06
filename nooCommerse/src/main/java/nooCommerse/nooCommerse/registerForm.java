package nooCommerse.nooCommerse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class registerForm {
	public static String browser = "chrome";
	public static WebDriver driver;

	/**
	 * @param args
	 */
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
			
			String registerUrl = "https://demo.nopcommerce.com/register?returnUrl=%2F";
			driver.get(registerUrl);
			
		//Radio button click :
			WebElement radiobtn = driver.findElement(By.id("gender-male"));
			radiobtn.click();
			
			WebElement fname = driver.findElement(By.id("FirstName"));
			fname.sendKeys("Nikhil");;
			
			WebElement lname = driver.findElement(By.id("LastName"));
			lname.sendKeys("Khandelwal");;
			
			//DateOfBirth : 
			//Day
			WebElement day = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
			Select select = new Select(day);
//			select.selectByValue("1");
			select.selectByIndex(5); 
			
			//Month : 
			WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
			select = new Select(month);
			List<WebElement>alloption = select.getOptions();
			for(WebElement option:alloption)
			{
				if(option.getText().equals("December")) {
					option.click();
					break;
				}
			}
			
			//Year : 
			WebElement year = driver.findElement(By.name("DateOfBirthYear"));
			select = new Select(year);
			List<WebElement>alloptions = select.getOptions();
			for(WebElement option:alloptions) {
				if(option.getText().equals("2000")) {
					option.click();
					break;
				}
			}
			
			//Email : 
			WebElement email = driver.findElement(By.id("Email"));
			email.sendKeys("Nikhil.khandelwal@gmail.com");
			
			// Company Name
			WebElement companyName = driver.findElement(By.xpath("//input[@id='Company' or @name='Company']"));
			companyName.sendKeys("Sarvika technologies Pvt Ltd.");
			
			//Options : 
			WebElement options = driver.findElement(By.xpath("//input[@id='Newsletter' or @name='Newsletter']"));
			options.click();
			
			
			//password :
			WebElement pass = driver.findElement(By.xpath("//input[@type='password' or @id='Password']"));
			pass.sendKeys("Nikhil@123");
			
			
			//Confirm password :
			WebElement Cpass = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
			Cpass.sendKeys("Nikhil@123");
			
			
			//Click Register btn : 
			
			WebElement regBtn = driver.findElement(By.id("register-button"));
			regBtn.click();
	
		}
		
			
		
		
		
	}


