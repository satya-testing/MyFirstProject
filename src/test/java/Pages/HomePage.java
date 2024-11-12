package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	  WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}

	 String hamburger_menu = "//input[@type='checkbox']";
	
	 String onlineproduct_link = "//li[normalize-space()='Online Products']";
	

	public  void click_hamburger_menu()  {
		driver.findElement(By.xpath(hamburger_menu)).click();
		
	}
	
	public  void click_onlineproduct_link() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(onlineproduct_link)).click();
	}
}

//this code is pushed to remote repo