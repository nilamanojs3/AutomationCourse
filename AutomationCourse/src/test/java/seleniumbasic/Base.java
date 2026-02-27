package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base
{
	public WebDriver driver;//driver is the reference variable for webdriver class
	
	public void browserLaunch()
	{
		driver =new ChromeDriver();
		driver.get("https://selenium.qabible.in/");//launching the URL
		driver.manage().window().maximize();//to maximizing the window
	}
	
	public void closeAndQuit()
	{
		//driver.close();
		driver.quit();
	}
	public static void main(String[] args)
	{
		Base base=new Base();
		base.browserLaunch();
		base.closeAndQuit();
	}

}
