package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable extends Base
{
	
public void verifyTable()
{
	driver.navigate().to("https://money.rediff.com/indices/nse");
	//WebElement fulltable=driver.findElement(By.id("dataTable"));
	//System.out.println(fulltable.getText());//to get all elements from the table
	
	WebElement tablerow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
	System.out.println(tablerow.getText());//to get the first row of the table
}

	public static void main(String[] args)
	{
		HandlingTable table=new HandlingTable();
		table.browserLaunch();
		table.verifyTable();

	}

}
