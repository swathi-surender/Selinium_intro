package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anotherway_addtocart {
	public static void main(String[] args) {

		String[] veg = { "Cucumber", "Beans", "Carrot", "Musk","Grapes","Mango" };

		System.setProperty("webdriver.chrome.driver", "C:\\Browserdrivers\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		// Opening URL

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		driver.manage().window().maximize();

		for (int i = 0; i < veg.length; i++) {

		driver.findElement(By.xpath("//h4[contains(text(),'" + veg[i] + "')]/following-sibling::div[2]/button")).click();



		}



		}


}
