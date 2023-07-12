package HMS_Regration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC1 {

	public static void main(String[] args) {
	//	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new ChromeDriver(); // browser opening
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Hospital Management System"));
		// entering the url
		driver.get("http://rmgtestingserver/domain/Hospital_Management_System/");
		// click on the doctor module
		driver.findElement(By.xpath("//h3[.='Doctors Login']/../div[@class='button']")).click();
		
	}

}
