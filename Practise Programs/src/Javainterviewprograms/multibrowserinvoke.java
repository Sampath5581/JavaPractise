package Javainterviewprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multibrowserinvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://stackoverflow.com/questions/20428732/how-do-i-retrieve-the-version-of-selenium-currently-installed-from-python");
driver.get("https://www.linkedin.com/pulse/importance-javascript-executor-selenium-mahesh-patnam");
driver.get("https://askubuntu.com/questions/261499/how-do-i-check-the-version-of-the-selenium-api-installed");
	}

}
