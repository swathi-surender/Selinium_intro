package selinium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class bookingticket_clickjet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Browserdrivers\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
	    System.out.println(driver.getTitle());

// OriginStation
WebElement origin=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
origin.click();
WebElement Originpalce=driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='HYD']"));
Originpalce.click();
System.out.println(Originpalce.getText());
Thread.sleep(1000);	
WebElement destinationpalce=driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='SAG']"));
destinationpalce.click();
System.out.println(destinationpalce.getText());

//selecting date of departure
/*driver.findElement(By.cssSelector(".ui-state-default ui-state-highlight")).click();

driver.findElement(By.id("divpaxinfo")).click();

System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); */

//Thread.sleep(2000);

int i=1;
while(i<5)
{
	driver.findElement(By.id("hrefIncAdt")).click();
	i++;
}
driver.findElement(By.id("btnclosepaxoption")).click();
Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
// select money option static dropdown
Select dropdown =new Select(staticdropdown);
dropdown.selectByIndex(2);
System.out.println(dropdown.getFirstSelectedOption().getText());
dropdown.selectByVisibleText("INR");
driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		driver.close();
	}

}
