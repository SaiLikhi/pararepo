package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 
{
public void m1()
{
	WebDriver driver = null;
	String BROWSER = System.getProperty("browser");
	String URL = System.getProperty("url");
	
	if(BROWSER.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(BROWSER.equalsIgnoreCase("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		new FirefoxDriver();
	}
	else
	{
		driver=new ChromeDriver();
	}
	driver.get(URL);
}
}
