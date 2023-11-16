package demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchYoutube {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\WebDrivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.id("search")).sendKeys("text");
		
		
		
	}

}
