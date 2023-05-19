package hanish;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namrata
{
		public static void main(String[] args) {
					   
		   System.setProperty("webdriver.chrome.driver","C://Users//Maharshi//Desktop//SeleniumJars//chromedriver_win32//chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("http://www.facebook.com/");
	         driver.manage().window().maximize();
	         //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));						}
}
}


