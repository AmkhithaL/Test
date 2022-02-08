package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\AMKHITHA\\Desktop\\IEDriverServer.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		
	}

}
