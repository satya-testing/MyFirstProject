package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;


public class ProductsPage {
	 WebDriver driver;
	 ExtentTest test ;
	public ProductsPage(WebDriver driver, ExtentTest test)
	{
		this.driver = driver;	
		this.test = test;
	}
	
	public static String foramlShoes_title = "//h2[normalize-space()='Formal Shoes']";
	
	public static String sportsShoes_title = "//h2[normalize-space()='Sports Shoes']";
	
	public static String sneakerShoes_title = "/html/body/div[4]/center/h2";
	
	public static String formalShoes_dropdown = "/html/body/div[2]/center/div/i[1]";
	
	public static String sportsShoes_dropdown = "/html/body/div[3]/center/div/i[1]";
	
	public static String sneakerShoes_dropdown = "/html/body/div[4]/center/div/i[1]";
	
	public static String formalShoes_firstShoeName = "/html/body/div[2]/table/tbody/tr[1]/td[1]";
	
	public static String sportsShoes_firstShoeName = "/html/body/div[3]/table/tbody/tr[1]/td[1]";
	
	public static String sneakerShoes_firstShoeName = "/html/body/div[4]/table/tbody/tr[1]/td[1]";
	
	
	public  void FormalShoes_verifyTitle() {
		
		String actualTitle_formalshoes = driver.findElement(By.xpath(foramlShoes_title)).getText().trim();
		System.out.println("<<<<<<formal shoes>>>>>>>"+actualTitle_formalshoes);
		String expectedTitle_foramshoes = "Formal Shoes";
		
	/*	Assert.assertEquals(expectedTitle_foramshoes,actualTitle_formalshoes );	
		if(actualTitle_formalshoes.equals(expectedTitle_foramshoes))
		{
			test.log(Status.PASS, "Testcase Pass: Formal shoes title is verified");
		}else
		{
			test.log(Status.FAIL, "Testcase Fail: Formal shoes title found mismatch ");
		}
	*/
		try {
			Assert.assertEquals(expectedTitle_foramshoes,actualTitle_formalshoes );
			test.log(Status.PASS, "Testcase Pass: Formal shoes title is verified");
		}catch (AssertionError e) {
			test.log(Status.FAIL, "Testcase Fail: Formal shoes title is found mismatch ");			
			throw e;
		}
	}

	
	public  void SportsShoes_verifyTitle() {
	//	String actualTitle_sportsshoes = driver.findElement((By.xpath(sportsShoes_title)).getText();
		String actualTitle_sportsshoes =driver.findElement(By.xpath(sportsShoes_title)).getText().trim();
		System.out.println("<<<<<sports shoes>>>>>>"+actualTitle_sportsshoes);
		String expectedTitle_sportsshoes = "Sports Shoes";
	/*	Assert.assertEquals(expectedTitle_sportsshoes, actualTitle_sportsshoes);
		if(actualTitle_sportsshoes.equals(expectedTitle_sportsshoes))
		{
			test.log(Status.PASS, "Testcase Pass: Sports shoes title is verified");
		}else
		{
			test.log(Status.FAIL, "Testcase Fail: Sports shoes title found mismatch ");
		}
	*/	
		try {
			Assert.assertEquals(expectedTitle_sportsshoes, actualTitle_sportsshoes);
			test.log(Status.PASS, "Testcase Pass: Sports shoes title is verified");
		}catch(AssertionError e) {
			test.log(Status.FAIL, "Testcase Fail: Sports shoes title is found mismatch ");
			throw e;
		}
	}
	
	public  void SneakerShoes_verifyTitle() {
		String actualTitle_sneakershoes = driver.findElement(By.xpath(sneakerShoes_title)).getText().trim();
		System.out.println("<<<<<sneakers>>>>>"+actualTitle_sneakershoes);
		String expectedTitle_sneakershoes = "Sneakers";
	/*	Assert.assertEquals(expectedTitle_sneakershoes, actualTitle_sneakershoes);
		if(actualTitle_sneakershoes.equals(expectedTitle_sneakershoes))
		{
			
			test.log(Status.PASS, "Testcase Pass: Sneakers shoes title is verified");
		}else
		{
			test.log(Status.FAIL, "Testcase Fail: Sneakers shoes title found mismatch ");
			
		}
	*/
		try {
			Assert.assertEquals(expectedTitle_sneakershoes, actualTitle_sneakershoes);
			test.log(Status.PASS, "Testcase Pass: Sneakers shoes title is verified");
		}catch(AssertionError e) {
			test.log(Status.FAIL, "Testcase Fail: Sneakers shoes title is found mismatch ");
			throw e;
		}
	}
	
	public  void formalShoes_verify_1stshoe() {
		String expected_foramlshoe_1stname ="Classic Cheltenham";
		driver.findElement(By.xpath(formalShoes_dropdown)).click();
		String actual_formalshoe_1stname = driver.findElement(By.xpath(formalShoes_firstShoeName)).getText().trim();
	/*	Assert.assertEquals(actual_formalshoe_1stname, expected_foramlshoe_1stname);
		if(expected_foramlshoe_1stname.equals(actual_formalshoe_1stname))
		{
			test.log(Status.PASS, "Testcase Pass: 1st Foraml shoe name is verified");
		}else
		{
			test.log(Status.FAIL, "Testcase Fail: 1st Formal shoe name found mismatch ");
		}
	*/
		try {
			Assert.assertEquals(actual_formalshoe_1stname, expected_foramlshoe_1stname);
			test.log(Status.PASS, "Testcase Pass: 1st Foraml shoe name is verified");
		}catch(AssertionError e) {
			test.log(Status.FAIL, "Testcase Fail: 1st Formal shoe name is found mismatch ");
			throw e;
		}
	}
	
	public  void sportsShoes_verify_1stshoe() {
		String expected_sportsshoe_1stname = "Ultimate";
		driver.findElement(By.xpath(sportsShoes_dropdown)).click();
		String actual_sportsshoe_1stname=driver.findElement(By.xpath(sportsShoes_firstShoeName)).getText().trim();
	/*	Assert.assertEquals(actual_sportsshoe_1stname, expected_sportsshoe_1stname);
		if(expected_sportsshoe_1stname.equals(actual_sportsshoe_1stname))
		{
			test.log(Status.PASS, "Testcase Pass: 1st Sports shoe name is verified");
		}else
		{
			test.log(Status.FAIL, "Testcase Fail: 1st Sports shoe name found mismatch ");
		}
	*/
		try {
			Assert.assertEquals(actual_sportsshoe_1stname, expected_sportsshoe_1stname);
			test.log(Status.PASS, "Testcase Pass: 1st Sports shoe name is verified");
		}catch(AssertionError e) {
			test.log(Status.FAIL, "Testcase Fail: 1st Sports shoe name is found mismatch ");
			throw e;
		}
	}
	
	public  void sneakerShoes_verify_1stshoe() {
		String expected_sneakershoe_1stname = "Archivo";
		driver.findElement(By.xpath(sneakerShoes_dropdown)).click();
		String actual_sneakershoe_1stname =driver.findElement(By.xpath(sneakerShoes_firstShoeName)).getText().trim();
	/*	Assert.assertEquals(actual_sneakershoe_1stname,expected_sneakershoe_1stname );
		if(expected_sneakershoe_1stname.equals(actual_sneakershoe_1stname))
		{
			test.log(Status.PASS, "Testcase Pass: 1st Sneakers shoe name is verified");
		}else
		{
			test.log(Status.FAIL, "Testcase Fail: 1st Sneakers shoe name found mismatch "+"expected shoe: "+expected_sneakershoe_1stname+"But found: "+actual_sneakershoe_1stname);
		}
	*/	
		try {
			Assert.assertEquals(actual_sneakershoe_1stname,expected_sneakershoe_1stname );
			test.log(Status.PASS, "Testcase Pass: 1st Sneakers shoe name is verified");
		}catch(AssertionError e) {
			test.log(Status.FAIL, "Testcase Fail: 1st Sneakers shoe name found mismatch "+"expected shoe: "+expected_sneakershoe_1stname+"But found: "+actual_sneakershoe_1stname);
			throw e;
		}
	}
	
	
}
