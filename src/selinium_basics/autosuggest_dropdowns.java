package selinium_basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggest_dropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Browserdrivers\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		
		driver.manage().window().maximize();
	    System.out.println(driver.getTitle());
	    driver.findElement(By.cssSelector("#autosuggest")).sendKeys("sw");
	    Thread.sleep(1000);
List<WebElement> options =driver.findElements(By.cssSelector(" li[class='ui-menu-item'] a"));
	
		for(WebElement option : options) {
			if (option.getText().equalsIgnoreCase("Switzerland")){
				option.click();
				break;
			}
		}
driver.close();
	}

}
