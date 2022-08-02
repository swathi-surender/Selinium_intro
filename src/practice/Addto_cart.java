package practice;

import java.time.Duration;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addto_cart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdrivers\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		int j = 0;
		String[] items ={"Cucumber","Brocolli","Beetroot"};

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);

		// check whether you extracted name is in arraylist or not
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			// Cucumber -1kg
			String[] name = products.get(i).getText().split("-");// we need to change string as arraystring
			// name[0]="cucumber "
			// name[1]="1kg"
			// we are trimming the space
			String Actualname = name[0].trim();
			// convert array into arraylist for easy search
			List itemsneeded = Arrays.asList(items);

			if (itemsneeded.contains("Actualname")) {
				j++;
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				if (j == 3) {
					break;
				}
			}

		}
//driver.close(); 
	}
}
