package Webapplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chromeinvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webDriver.Chrome.Driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver.get("http://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	
		
		Select tr=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		System.out.println(tr.getOptions());
	
		List<WebElement> v=tr.getOptions();
	/*	System.out.println(v.size());*/
		
	for(int i=0;i<v.size();i++)
	{
		String s=v.get(i).toString();
		System.out.println(s);
	}
	
	
		//tr.selectByIndex(1);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		//driver.findElement(By.id("q")).sendKeys("Selenium");
		//driver.findElement(By.linkText("edit this page")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		

	}

}
