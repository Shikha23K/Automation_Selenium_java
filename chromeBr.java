package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeBr {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\corizo\\software testing\\All_Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		
		
	}
}
