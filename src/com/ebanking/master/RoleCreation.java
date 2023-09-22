package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RoleCreation 
{

	 //EP
	
	@FindBy(id="txtRname")
	WebElement RoleName;
	
    @FindBy(id="lstRtypeN")
	WebElement RType;
	
    @FindBy(id="btninsert")
	WebElement Rsubmit;
    
    public void Rcreation(String Rn,String Rt) throws InterruptedException 
    {
    	RoleName.sendKeys(Rn);
    	Select RT=new Select(RType);
    	RT.selectByVisibleText(Rt);
    	Thread.sleep(3000);
    	Rsubmit.click();
    }
}
