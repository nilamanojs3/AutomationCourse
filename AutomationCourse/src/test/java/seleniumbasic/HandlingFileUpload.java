package seleniumbasic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base
{
	public void fileUploadUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement upload=driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("C:\\Users\\Nila\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\Java Note.pdf");
		WebElement checkbox=driver.findElement(By.id("terms"));
		checkbox.click();
		WebElement submitbutton=driver.findElement(By.id("submitbutton"));
		submitbutton.click();
	}
	 
	public void fileUploadUsingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectfile=driver.findElement(By.id("pickfiles"));
		selectfile.click();
		StringSelection s=new StringSelection("C:\\Users\\Nila\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\Java Note.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		Robot r=new Robot();
		r.delay(2500); 
 		r.keyPress(KeyEvent.VK_ENTER); 
 		r.keyRelease(KeyEvent.VK_ENTER); 
 		r.keyPress(KeyEvent.VK_CONTROL); 
 		r.keyPress(KeyEvent.VK_V); 
 		r.keyRelease(KeyEvent.VK_CONTROL); 
 		r.keyRelease(KeyEvent.VK_V); 
 		r.keyPress(KeyEvent.VK_ENTER); 
 		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	public static void main(String[] args) 
	{
		HandlingFileUpload fileupload=new HandlingFileUpload();
		fileupload.browserLaunch();
		//fileupload.fileUploadUsingSendKeys();
		try {
			fileupload.fileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
