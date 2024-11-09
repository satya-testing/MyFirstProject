package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Pages.HomePage;
import Pages.ProductsPage;

public class SeleniumTest {
		
	 public  WebDriver driver;
	 ExtentReports report;
	 ExtentTest test;
	  
	 ExtentReports extent_report = new ExtentReports();
	
	@BeforeTest
	public  void setup() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
		
		ExtentSparkReporter spark_report = new ExtentSparkReporter(System.getProperty("user.dir")+"\\extentReports\\report.html");
		extent_report.attachReporter(spark_report);
	}
	
	@Test (priority =1)
	void ValidateTitles_onlineProducts() throws InterruptedException {
		test = extent_report.createTest("Validate shoes title on product page","This test validate the different shoe types are corrent on online products page");
		HomePage hm = new HomePage(driver);
		hm.click_hamburger_menu();
		hm.click_onlineproduct_link();
	//	HomePage.click_hamburger_menu();
	//	HomePage.click_onlineproduct_link();
		
		ProductsPage pp = new ProductsPage(driver,test);
		pp.FormalShoes_verifyTitle();
		pp.SportsShoes_verifyTitle();
		pp.SneakerShoes_verifyTitle();
	//	extent_report.flush();
	}
	
	@Test	(priority =2)
	void validateFirstFormalshoe() {
		test = extent_report.createTest("Validate 1st Formal shoes name on product page","This test validate the  correct formal shoe prodcut is displayed under formal shoes category");

		ProductsPage Fshoe = new ProductsPage(driver,test);
		Fshoe.formalShoes_verify_1stshoe();
	}
	
	@Test	(priority =3)
	void validateFirstSportsshoe() {
		test = extent_report.createTest("Validate 1st Sports shoes name on product page","This test validate the  correct Sports shoe prodcut is displayed under Sports  category");

		ProductsPage Spshoe = new ProductsPage(driver,test);
		Spshoe.sportsShoes_verify_1stshoe();
	}
	
	@Test	(priority =4)
	void validateFirstSneakershoe() {
		test = extent_report.createTest("Validate 1st sneakers shoes name on product page","This test validate the  correct sneakers shoe prodcut is displayed under sneakers shoes category");

		ProductsPage Sneakershoe = new ProductsPage(driver,test);
		Sneakershoe.sneakerShoes_verify_1stshoe();
	}
	

	
	@AfterTest
	public void teardown()
	{
		extent_report.flush();
		driver.quit();
	}
	 
	
}
