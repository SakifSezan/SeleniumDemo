package demoproject;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SC2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver", "C:\\WebDrivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\SAKIF\\eclipse-workspace\\SeleniumDemo\\Screenshots\\homepage.png");
		
		FileUtils.copyDirectory(src, trg);
		
		
		driver.close();
		
	}

}
