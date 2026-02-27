package seleniumbasic;

public class BrowerAndNavigationCommands extends Base
{
	public void verifyBrowserCommands()
	{
		String title=driver.getTitle();//to get the title of the browser
		System.out.println(title);
		String url=driver.getCurrentUrl();//to get the browser URL
		System.out.println(url);
		String source=driver.getPageSource();//to get the source code of the browser
		System.out.println(source);
		//every window has a different handle ID
		String handleId=driver.getWindowHandle();//to get the handle Id of one window
		System.out.println(handleId);
		//WindowHandles--used to get multiple windows handle id
	}
	
	public void verifyNavigationCommands()
	{
		driver.navigate().to("https://www.amazon.ca/?asc_source=01KAW8HN4XCRQRYVAEV5NSS4MA&tag=snxca521-20");
		driver.navigate().back();//go back to obsqura page
		driver.navigate().forward();//go to amazon page
		driver.navigate().refresh();//refresh the page
		
	}

	public static void main(String[] args)
	{
		BrowerAndNavigationCommands browser=new BrowerAndNavigationCommands();
		browser.browserLaunch();
		//browser.verifyBrowserCommands();
		browser.verifyNavigationCommands();

	}

}
