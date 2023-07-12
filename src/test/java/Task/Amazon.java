package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	@Test
	void run() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("earphones");
		Thread.sleep(2000);
		
		List<WebElement> all_sug = driver.findElements(By.xpath("//div[@class='two-pane-results-container']//div/descendant::div[@class='s-suggestion-container']"));
		Thread.sleep(2000);
		
//		for (int i = 0; i < all_sug.size(); i++) {
//			if (all_sug.get(i).getText().equals("earphones wireless")) {
//				all_sug.get(i).click();
//				Thread.sleep(3000);
//			}
//		}
		for (WebElement ele : all_sug) {
			if (ele.getText().contains("earphones wireless")) {
				ele.click();
				
			}
		}
		Thread.sleep(2000);
		driver.quit();
		
	}
}
