package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ALoginSD
{

   WebDriver driver;
   
@Given("^Tester Should on RHP$")
public void tester_Should_on_RHP() throws Throwable 
{
      driver=new FirefoxDriver();
      driver.get("http://103.211.39.246/ranford2");
      driver.manage().window().maximize();
}

@When("^Tester enters \"(.*)\" and \"(.*)\"$")
public void tester_enters_Un_and_Pwd(String Uname,String Pswd) throws Throwable 
{
	 driver.findElement(By.id("txtuId")).sendKeys(Uname);
     driver.findElement(By.id("txtPword")).sendKeys(Pswd);
     Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id=\'login\']")).click();
}

@Then("^Tester validates admin login$")
public void tester_validates_admin_login() throws Throwable 
{
	String Expval="Welcome to Admin";
	
	   String Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	      
	      //Comparision
	      
	      if (Expval.equalsIgnoreCase(Actval)) 
	      {
			System.out.println("Admin login Succ");
		}
	      else
	      {
	    	  System.out.println("Admin login Failed");
	      }
	    
}


}
