package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmentbasicform {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdrivers\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		// driver.findElement(By.xpath("//div/input[contains(@class,'ng-invalid
		// ng-touched')]")).sendKeys("swathi");
		driver.findElement(By.name("name")).sendKeys("swathi");

		driver.findElement(By.name("email")).sendKeys("puli.saiswathi03@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("swathi03");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));

		Select dropdown = new Select(staticdropdown);
		dropdown.selectByVisibleText("Female");

		WebElement radiobutton = driver.findElement(By.id("inlineRadio1"));
		radiobutton.click();
		System.out.println(radiobutton.isSelected());

		driver.findElement(By.name("bday")).sendKeys("12/9/1992");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		driver.close();
	}

}
