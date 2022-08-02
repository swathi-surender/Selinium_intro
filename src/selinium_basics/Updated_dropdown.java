package selinium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Updated_dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Browserdrivers\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		Thread.sleep(2000);
		
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
			
		/*for(int i=1;i<5;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		
		}*/
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//validating is ui elements are enabled or disabled with attributes
	/*System.out.println(	driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());*/

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("is enabeled");
			//Assert.assertTrue(true);
			}else
			{
				Assert.assertTrue(false);

			}
		driver.close();
		
		
	}

}
