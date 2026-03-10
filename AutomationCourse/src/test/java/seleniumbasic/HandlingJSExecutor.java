package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HandlingJSExecutor extends Base
{
	public void verifyJSExecutor()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showmsgbtn=driver.findElement(By.id("button-one"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", showmsgbtn);
		js.executeScript("window.scrollBy(0,-350)", "");//scroll up negative value else positive ,for left and right change x axis value
	}
	public static void main(String[] args)
	{
		HandlingJSExecutor jsexe=new HandlingJSExecutor();
		jsexe.browserLaunch();
		jsexe.verifyJSExecutor();

	}

}
