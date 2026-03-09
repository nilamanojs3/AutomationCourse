package seleniumbasic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base
{
	 public void verifyRightClick() 
	 {
		 WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
				 Actions ac=new Actions(driver);
				 ac.contextClick(home).build().perform();
		 
	 }
	 
	 public void verifyMouseHover() 
	 {
		 WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
				 Actions ac=new Actions(driver);
				 ac.moveToElement(home).build().perform();
		 
	 }
	 
	 public void verifyDragandDrop() 
	 {
		 driver.navigate().to("https://demoqa.com/droppable");
		 WebElement drag=driver.findElement(By.id("draggable"));
		 WebElement drop=driver.findElement(By.id("droppable"));
		  Actions ac=new Actions(driver);
		 ac.dragAndDrop(drag,drop).build().perform();
		 
	 }
	 
	 public void verifyKeyboardAction() throws AWTException
	 {
		 Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		 
	 }
	 
	public static void main(String[] args) 
	{
		HandlingActions dragdrop=new HandlingActions();
		dragdrop.browserLaunch();
		//dragdrop.verifyRightClick();
		//dragdrop.verifyMouseHover();
		//dragdrop.verifyDragandDrop();
		try {
			dragdrop.verifyKeyboardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
