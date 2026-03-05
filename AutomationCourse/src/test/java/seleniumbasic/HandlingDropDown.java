package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base
{
     public void verifyDropDown()
     {
    	 driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
    	 WebElement dropdown=driver.findElement(By.id("dropdowm-menu-1"));
    	 
    	 Select select=new Select(dropdown);//creating an object of select class to use the prdefined below select class methods
    	 //method selectByIndex()
    	 //select.selectByIndex(1);//to choose C# in the drop down
    	 
    	 //method-select byvalue
    	 //select.selectByValue("sql");
    	 
    	 //select by visible text
    	 select.selectByVisibleText("Python");
    	 
     }
     
     public void verifyByCheckBox()
     {
    	 driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
    	WebElement checkbox=driver.findElement(By.xpath("//input[@value='option-1']"));
    	//System.out.println(checkbox.isSelected());//checking dropdown selected or not before click then o/p is false
    	checkbox.click();
    	System.out.println(checkbox.isSelected());//checking dropdown selected or not before click then o/p is trues
     }
	public static void main(String[] args) 
	{
		HandlingDropDown drop=new HandlingDropDown();
		drop.browserLaunch();
		//drop.verifyDropDown();
		drop.verifyByCheckBox();

	}

}
