package selinium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_dropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdrivers\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

// OriginStation
		WebElement origin = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		origin.click();

		/*
		 * driver.findElement(By.xpath("//a[contains(text(),'Hyderabad (HYD)')]")).click
		 * (); Thread.sleep(1000);
		 * driver.findElement(By.xpath("(//a[@value='MAA']) [2]")).click();
		 */
		// Instead of using index in xpath we can use parent child relation then code is
		// must be appreciated

		WebElement Originpalce = driver
				.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='HYD']"));
		Originpalce.click();
		System.out.println(Originpalce.getText());
		Thread.sleep(1000);
		WebElement destinationpalce = driver.findElement(
				By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='SAG']"));
		destinationpalce.click();
		System.out.println(destinationpalce.getText());

		driver.close();
	}

}
