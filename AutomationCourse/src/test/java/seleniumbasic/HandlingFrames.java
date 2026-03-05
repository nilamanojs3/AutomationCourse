package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base
{

	public void verifyFrames() 
	{
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement>totalframes=driver.findElements(By.tagName("iframe"));
		System.out.println(totalframes.size());
		
		WebElement frame=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame);
		WebElement frametext=driver.findElement(By.id("sampleHeading"));
		System.out.println(frametext.getText());
		driver.switchTo().defaultContent();//switch to back from the Frame
		
	}
	public static void main(String[] args) 
	{
	  HandlingFrames frame=new HandlingFrames();
	  frame.browserLaunch();
	  frame.verifyFrames();

	}

}
