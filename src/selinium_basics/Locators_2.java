package selinium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators_2 {

	public static void main(String[] args) throws InterruptedException {
		String name = "swathi";
		System.setProperty("webdriver.chrome.driver","C:\\Browserdrivers\\chromedriver.exe ");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String pwd =getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(pwd); 
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
System.out.println(driver.findElement(By.tagName("p")).getText());
Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
//driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
	
driver.close();
	}
	public static String getpassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
	String forgotpwdtext=driver.findElement(By.cssSelector("form p")).getText();
	//Please use temporary password 'rahulshettyacademy' to Login.
	String[] passwordArray =forgotpwdtext.split("'");
	//String[] passwordArray2 = passwordArray[1].split("'");
	// passwordArray2[0];
	//storing he pwd directly to string variable
	String forgotpwd=passwordArray[1].split("'")[0];
	return forgotpwd;
	
		
		
	}
}
