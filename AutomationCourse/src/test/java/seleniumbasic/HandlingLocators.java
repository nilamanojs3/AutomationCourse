package seleniumbasic;

import org.openqa.selenium.By;

public class HandlingLocators extends Base
{

	public void verifyLocators()
	{
		driver.findElement(By.id("single-input-field"));//locating using ID
		
		driver.findElement(By.className("form-control"));//locating element using classname
		
		driver.findElement(By.tagName("input"));//locating element using tag name
		
		driver.findElement(By.name("viewport"));//locating element using name attribute value
		
		driver.findElement(By.linkText("Radio Buttons Demo"));//locating element using text associated with the test associated with the link
		
		driver.findElement(By.partialLinkText("Radio"));
		
		driver.findElement(By.cssSelector("input[id='single-input-field']"));
		
		// /html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button--this is the absolute xpath for show message button
		//Absolute xpath select the root to the element.
		//if any value change in between the buton element the absolute xpath will be incorrect for the button show message.That's why we are not usig Absolute xpath
		
		//Relative Xpath--//tagname[@attributename='attributevalue']
		driver.findElement(By.xpath("//button[@id='button-one']"));//xpath using ID attribute and value
		driver.findElement(By.xpath("//button[text()='Show Message']"));//using text() method to write the Xpath
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));//using AND function 
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));//using OR function
		driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));//using parent access method using contains()
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));//using Child method
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));//using following method
		driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));//using Preceding method
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));//using ancestor method
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));//using descendant method
		
		
	}
	public static void main(String[] args) 
	{
	

	}

}
