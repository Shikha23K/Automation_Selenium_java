package AutomationProg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;




public class demoQALogin {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.findElement(By.id("userName")).sendKeys("Shikhak");
		driver.findElement(By.id("password")).sendKeys("Shikha@1234");
		driver.findElement(By.cssSelector("#login")).click();
		String profileTag=driver.findElement(By.xpath("//*[text()='Profile']")).getText();
		if(profileTag.equals("Profile"))
			System.out.println("It is Correct");
		else
			System.out.println("It is not Correct");
		
		driver.close();
	}

}
