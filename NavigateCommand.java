package test1;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
public class NavigateCommand {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.youtube.com/");
		System.out.println("Opened page title : "+driver.getTitle());
		
		//1. navigate().to()
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("Navigated page title : "+driver.getTitle());
		//2.navigate().back()
		driver.navigate().back();
		System.out.println("Navigated back page title : "+driver.getTitle());
		//3.navigate().forward()
		driver.navigate().forward();
		System.out.println("Navigated forward page title : "+driver.getTitle());
		
		//navigate().refresh()
		driver.navigate().refresh();
		System.out.println("Refreshed page title : "+driver.getTitle());
		driver.close();
	}

}
