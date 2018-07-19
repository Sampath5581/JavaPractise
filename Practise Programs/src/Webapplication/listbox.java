package Webapplication;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class listbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		
		System.setProperty("webDriver.Chrome.Driver", "D:\\IEDriverServer.exe");
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
	/*	WebElement at=wait.until(ExpectedConditions.elementToBeClickable*/
				driver.findElement(By.xpath("//button[@onclick='pushAlert()']")).click();
		//at.click();
		
		
		/*driver.get("http://testingpool.com/handling-different-type-of-pop-ups-in-selenium-webdriver/");
		driver.findElement(By.partialLinkText("Demo Application")).click();
		driver.findElement(By.id("btnConfirm")).click();*/
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}

}
