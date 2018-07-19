package Webapplication;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class flipkart {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//WebDriver driver=new InternetExplorerDriver();

DesiredCapabilities cap = DesiredCapabilities.chrome();
WebDriver driver = new RemoteWebDriver(new URL("http://10.109.26.161:4445/wd/hub"), cap);
System.setProperty("webDriver.chrome.Driver","D:\\chromedriver.exe");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
driver.get("https://www.assurant.com/");


	}

}
