package Assignments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println("Launching amazon");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String actualTitle=driver.getTitle();
		if(actualTitle.equals("Amazon"))
		{
			System.out.println("Titles are matching");
		}
		else
		{
			System.out.println("titles are not matching");
		}
		
		driver.navigate().back();
		driver.close();
	}

}
