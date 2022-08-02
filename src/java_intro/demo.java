package java_intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Browserdrivers\\chromedriver.exe ");
		ChromeDriver driver= new ChromeDriver();
       driver.get("http://www.zalando.ch");	
     System.out.println(driver.getTitle());
     System.out.println(driver.getCurrentUrl());
  /* String p= driver.getPageSource();
     System.out.println(p);*/

driver.close();
//driver.quit();

	}

}
