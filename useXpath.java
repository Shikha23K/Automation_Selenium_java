package AutomationProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class useXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//
//		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/");
		driver.findElement(By.xpath("//a[text()='Simple Form Demo']")).click();
		driver.findElement(By.id("user-message")).sendKeys("Hello World");
		driver.findElement(By.id("showInput")).click();
		driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("222");
		driver.findElement(By.xpath("//*[@id=\"sum2\"]")).sendKeys("333");
//		driver.findElement(By.xpath("//button[@placeholder='Please enter second value']")).sendKeys("333");
		driver.findElement(By.xpath("//button[text()='Get Sum']")).click();
		int sum=Integer.valueOf(driver.findElement(By.xpath("//*[@id=\"addmessage\"]")).getText());
		if(sum >490)
			System.out.println("Passed");
		else
			System.out.println("Failed");
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Input Form Submit']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Shikha k");
		
		/*Contain method when properties of an element is changing dynamically
		 //tagname[contains(@atribute,'value')]		 
		 */
		
		driver.findElement(By.xpath("//input[contains(@id,'inputEmail4')]")).sendKeys("Shikhakumari@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Company");
		driver.findElement(By.xpath("//input[@placeholder='Website']")).sendKeys("website.com");
		driver.findElement(By.xpath("//input[@type='text'][@name='city']")).sendKeys("Patna");
		driver.findElement(By.xpath("//input[@id='inputAddress1']")).sendKeys("Boring Road");
		driver.findElement(By.xpath("//input[@id='address_line2']")).sendKeys("Anandpuri");
		driver.findElement(By.xpath("input[@placeholder='State']")).sendKeys("Bihar");
		driver.findElement(By.xpath("//input[@placeholder='Zip code']")).sendKeys("800001");
		
		
		
	}
	

}
