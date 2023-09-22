package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoleCreationSD 
{
     WebDriver driver;

@Given("^User Should on Ranford Home Page$")
public void user_Should_on_Ranford_Home_Page() throws Throwable 
{
	driver=new FirefoxDriver();
    driver.get("http://103.211.39.246/ranford2");
    driver.manage().window().maximize();
}

@When("^User Enter Login details$")
public void user_Enter_Login_details() throws Throwable 
{
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
    driver.findElement(By.id("txtPword")).sendKeys("TestingMindq");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\'login\']")).click();

}

@Then("^User Click on Role button$")
public void user_Click_on_Role_button() throws Throwable 
{
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
	Thread.sleep(3000);

}

@When("^User Click on New Role and enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_Click_on_New_Role_and_enter_and(String Rn, String Rt) throws Throwable 
{
	driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
	driver.findElement(By.id("txtRname")).sendKeys(Rn);
	driver.findElement(By.id("lstRtypeN")).click();
	driver.findElement(By.id("lstRtypeN")).sendKeys(Rt);
	
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='btninsert']")).click();
	
	//Alert

	Thread.sleep(3000);
	driver.switchTo().alert().accept();
}

@Then("^User Close the Application$")
public void user_Close_the_Application() throws Throwable 
{
     driver.close();
}


}
