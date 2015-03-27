package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class OperatoriTest {
	
	/*
	@Test(dataProvider="test1")
	public void testAdd(Double a,Double b)
	{
		double result = Operator.add(a, b);
		Assert.assertEquals(result, 12.0);

		
	}

	@Test
	 public void testSub()
	 {
		 double result=Operator.sub(7.0, 5.0);
	 Assert.assertEquals(result, 2.0);
		 
	 }

	@Test
	 public void testDiv()
	 {
		 double result=Operator.div(10.0, 2.0);
		 Assert.assertEquals(result, 5.0);
	 }
	@Test
	 public void testMul()
	 {
		
		 double result=Operator.mul(10.0, 2.0);
		 Assert.assertEquals(result, 20.0);
	 }*/
	
	
	@Test
	 public void testSub()
	 {
		
		WebDriver driver = new FirefoxDriver();
	    
		driver.get("http://www.github.com");
	    driver.findElement(By.linkText("Sign in")).click();
	    
		LoginPage loginPage = new LoginPage(driver);
		String username ="Ksushabstu";
		String pass="ksusha123";
		String rep_name="123";
		loginPage.login(username, pass);
		
	
		//WebElement element = driver.findElement(By.id("login_field"));
		CreateRepo cr =new CreateRepo(driver);
	    cr.create(rep_name);
		  
		 /* String name ="Ksushabstu";
		 String pass="ksusha123";
		  element.sendKeys(name);
		  element=driver.findElement(By.id("password"));
		  element.sendKeys(pass);
		  element.submit();*/	  
	 }
	
}
