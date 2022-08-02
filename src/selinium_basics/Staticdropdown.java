package selinium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Staticdropdown {

	public static void main(String[] args) {
			//System.setProperty("webdriver.chrome.driver","C:\\Browserdrivers\\chromedriver.exe ");
		WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
			WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			
			Select dropdown =new Select(staticdropdown);
			dropdown.selectByIndex(2);
			System.out.println(dropdown.getFirstSelectedOption().getText());
			dropdown.selectByVisibleText("INR");
			System.out.println(dropdown.getFirstSelectedOption().getText());
			dropdown.selectByValue("USD");
			System.out.println(dropdown.getFirstSelectedOption().getText());

			driver.close();
			
			
			
	}
	
	
	

}
