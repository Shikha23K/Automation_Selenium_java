package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCommand {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		//1. get()
		driver.get("https://www.saucedemo.com/");
		
		//2.getTitle()
		String title=driver.getTitle();
		System.out.println("Title:  "+title);
		
		//3.getCurrentUrl()
		System.out.println("URL of the page : "+driver.getCurrentUrl());
		
		//4.getText(): to fetch text from any element on page
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		//locating using xpath
		String Text=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div")).getText();
		System.out.println("Selected text  : "+Text);
		driver.close();//close current window only
		//driver.quit();//will close multiple opened window
		
	}

}
