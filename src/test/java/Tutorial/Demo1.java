package Tutorial;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");

	}

}
