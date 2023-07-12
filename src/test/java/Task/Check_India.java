package Task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check_India {
	@Test
	void check() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List<WebElement> teams = driver.findElements(By.xpath("//span[@class='u-hide-phablet']"));
		Thread.sleep(2000);
		for (WebElement ele : teams) {
//			if (ele.getText().contains("India")) {  
//				
//				System.out.println("present");
//			}
			System.out.println(ele.getText());
		}
		driver.close();
	}
}
	

