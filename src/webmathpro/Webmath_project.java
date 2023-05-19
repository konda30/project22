package webmathpro;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class Webmath_project {

		WebDriver driver;
		public String Url ="https://www.webmath.com/index.html";
		@BeforeTest
		public void lunch() {
			System.setProperty("webdriver.chrome.driver","C://Users//Maharshi//Desktop//SeleniumJars//chromedriver_win32//chromedriver.exe");
	   		ChromeOptions co = new ChromeOptions();
	   		co.addArguments("--remote-allow-origins=*");
	   		driver = new ChromeDriver(co);
	   		driver.manage().window().maximize();
	   		driver.get(Url);
		}
		@Test(priority = 1)
		public void Home() {
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/div/div/div[1]/a")).click();
			String ttl = driver.getTitle();
			String Exceptedttl ="WebMath - Solve Your Math Problem";
			Assert.assertEquals(ttl, Exceptedttl,"Title is not present");
		}
		@Test(priority = 2)
		public void Homepage() {
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/div/div/div[1]/a")).click();
	        WebElement Web1 = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div/div[1]/div[1]/div/div[1]/h1"));
	        WebElement dropbox = driver.findElement(By.name("topicItem"));
	        WebElement Gobtn = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div/div[1]/div[1]/div/div[4]/form/div/a/img"));

	        Assert.assertTrue(Web1.isDisplayed(),"Test failed Welcome to webmath not display");
	        Assert.assertTrue(dropbox.isDisplayed(),"Dropbox not visible");
	        Assert.assertTrue(Gobtn.isDisplayed(),"Go button not present");

	        Assert.assertTrue(dropbox.isEnabled(),"Dropbox not enabled");
	        Assert.assertTrue(Gobtn.isEnabled(),"Go button not enabled");        

		}
		@Test(priority = 3)
		public void Homepageverify() {
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/div/div/div[1]/a")).click();
	        driver.findElement(By.name("topicItem")).click();
	        driver.findElement(By.name("topicItem")).sendKeys("calculus derivatives");
	        driver.findElement(By.xpath("//*[@id=\"jumpToPage\"]/div/a/img")).click();
		}
		@Test(priority = 4)
		public void links() {
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/div/div/div[1]/a")).click();
	        WebElement contus = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/a[2]"));
	        WebElement aboutwebmath = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/a[3]"));
	        WebElement Whywebmath = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/a[4]"));
	        WebElement Websitemap = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/a[5]"));
	        WebElement privacypolicy = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/a[6]"));

	        Assert.assertTrue(contus.isDisplayed(),"contact us not displayed");
	        Assert.assertTrue(aboutwebmath.isDisplayed(),"about math is not displaye");
	        Assert.assertTrue(Whywebmath.isDisplayed(),"Why webmath is not displayed");
	        Assert.assertTrue(Websitemap.isDisplayed(),"Web site map is not displayed");
	        Assert.assertTrue(privacypolicy.isDisplayed(),"privacy policy is not displayed");

	        Assert.assertTrue(contus.isEnabled(),"contact us not enabled");
	        Assert.assertTrue(aboutwebmath.isEnabled(),"about math is not Enabled");
	        Assert.assertTrue(Whywebmath.isEnabled(),"Why webmath is not Enabled");
	        Assert.assertTrue(Websitemap.isEnabled(),"Web site map is not Enabled");
	        Assert.assertTrue(privacypolicy.isEnabled(),"privacy policy is not Enabled");

		}
		@Test(priority = 5)
		public void verifylinks() {
			driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/a[2]")).click();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/a[3]")).click();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/a[4]")).click();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/a[5]")).click();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/a[6]")).click();
	        driver.get(Url);

		}@Test(priority = 6)
		public void otherstuff() {
		 driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/div/div/div[8]/a")).click();
		 WebElement tag= driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[1]/h1"));
		 WebElement Quik = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/div/div[1]/form[2]/div"));
		 WebElement DropB= driver.findElement(By.name("topicItem"));
		 WebElement GoBtnn = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/div/div[1]/div/a/img"));
		 WebElement practisemath = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[1]/font/b"));
		 WebElement Basicmath = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td[1]/font/font/a[1]"));
		 WebElement polynomals = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td[1]/font/font/a[2]"));
		 WebElement Staticalcalculation = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td[1]/font/font/a[3]"));
		 WebElement sampledata = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[1]/font/font/a[4]"));
		 WebElement Handlingrownum = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[2]/font/b"));
		 WebElement avrage = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td[2]/font/font/a[1]"));
		 WebElement Standerddaviation = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[2]/font/font/a[2]"));
		 WebElement histograms = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[2]/font/font/a[3]"));

		 Assert.assertTrue(tag.isDisplayed(),"Other math stuff not avilable");
		 Assert.assertTrue(Quik.isDisplayed(),"Quick i need help with not display");
		 Assert.assertTrue(DropB.isDisplayed(),"dropbox not display");
		 Assert.assertTrue(GoBtnn.isDisplayed(),"Go button not display");
		 Assert.assertTrue(practisemath.isDisplayed(),"practice math is not display");
		 Assert.assertTrue(Basicmath.isDisplayed(),"Basic math is not display");
		 Assert.assertTrue(polynomals.isDisplayed(),"polynomals is not display");
		 Assert.assertTrue(Staticalcalculation.isDisplayed(),"Static calculation is not display");
		 Assert.assertTrue(sampledata.isDisplayed(),"sample data is not display");
		 Assert.assertTrue(Handlingrownum.isDisplayed(),"Handling row number is not display");
		 Assert.assertTrue(avrage.isDisplayed(),"avrage is not display");
		 Assert.assertTrue(Standerddaviation.isDisplayed(),"Standerd daviation is not display");
		 Assert.assertTrue(histograms.isDisplayed(),"histograms is not display");

		 Assert.assertTrue(DropB.isEnabled(),"drop box is not enabled");
		 Assert.assertTrue(GoBtnn.isEnabled(),"go button is not enabled");
		 Assert.assertTrue(Basicmath.isEnabled(),"basic math is not enabled");
		 Assert.assertTrue(polynomals.isEnabled(),"polynomals is not enabled");
		 Assert.assertTrue(Staticalcalculation.isEnabled(),"Statical calculation is not enabled");
		 Assert.assertTrue(sampledata.isEnabled(),"sampledata is not enabled");
		 Assert.assertTrue(avrage.isEnabled(),"avrage is not enabled");
		 Assert.assertTrue(Standerddaviation.isEnabled(),"Standerd daviation is not enabled");
		 Assert.assertTrue(histograms.isEnabled(),"histograms is not enabled");	
		}
		@Test(priority = 7)
		public void otherstuffverify() {
			driver.findElement(By.name("topicItem")).click();
			driver.findElement(By.name("topicItem")).sendKeys("calculus derivatives");

			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/div/div[1]/div/a/img")).click();
			driver.findElement(By.cssSelector("#navBox-7 > a")).click();
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[1]/font/font/a[1]")).click();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("#navBox-7 > a")).click();
	        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[1]/font/font/a[2]")).click();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("#navBox-7 > a")).click();
	        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[1]/font/font/a[3]")).click();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("#navBox-7 > a")).click();
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[1]/font/font/a[4]")).click();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("#navBox-7 > a")).click();
	        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[2]/font/font/a[1]")).click();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("#navBox-7 > a")).click();
	        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[2]/font/font/a[2]")).click();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("#navBox-7 > a")).click();
	        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[2]/font/font/a[3]")).click();

		}
		@Test(priority = 8)
		public void Basicmath() {
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/div/div/div[8]/a")).click();
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[1]/font/font/a[1]")).click();
			WebElement problem = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/ol/li[1]/select"));
			WebElement number = driver.findElement(By.name("ntype"));
			WebElement maxnum = driver.findElement(By.name("maxnum"));
			WebElement minnumber = driver.findElement(By.name("minnum"));
			WebElement yesbox = driver.findElement(By.name("subneg"));
			WebElement box = driver.findElement(By.name("dplaces"));
			WebElement Yesb = driver.findElement(By.name("mixedn"));
			WebElement genbox = driver.findElement(By.name("count"));
			WebElement Doitbtn = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/p/input[1]"));


			Assert.assertTrue(problem.isDisplayed(),"problem box is not displayed");
			Assert.assertTrue(number.isDisplayed(),"number box is displayed");
			Assert.assertTrue(maxnum.isDisplayed(),"maximum number box is displayed");
			Assert.assertTrue(minnumber.isDisplayed(),"minimum number box is not displayed");
			Assert.assertTrue(yesbox.isDisplayed(),"yes or no box is not displayed");
			Assert.assertTrue(box.isDisplayed(),"decimal number box is not displayed");
			Assert.assertTrue(Yesb.isDisplayed(),"yes or no box is not displayed");
			Assert.assertTrue(genbox.isDisplayed(),"problems box is not displayed");
			Assert.assertTrue(Doitbtn.isDisplayed(),"do it button is not display");

			Assert.assertTrue(problem.isEnabled(),"problem box is not clickable");
			Assert.assertTrue(number.isEnabled(),"number box is clickable");
			Assert.assertTrue(maxnum.isEnabled(),"maximum number box is clickable");
			Assert.assertTrue(minnumber.isEnabled(),"minimum number box is not clickable");
			Assert.assertTrue(yesbox.isEnabled(),"yes or no box is not clickable");
			Assert.assertTrue(box.isEnabled(),"decimal number box is not clickable");
			Assert.assertTrue(Yesb.isEnabled(),"yes or no box is not clickable");
			Assert.assertTrue(genbox.isEnabled(),"problems box is not clickable");
			Assert.assertTrue(Doitbtn.isEnabled(),"do it button is not clickable");
		}
		@Test(priority = 9)
		public void basic_math_verification() {
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/div/div/div[8]/a")).click();
			driver.findElement(By.cssSelector("#d-childMainContLeft > div:nth-child(3) > table > tbody > tr > td:nth-child(1) > font > font > a:nth-child(1)")).click();
			driver.findElement(By.name("ptype")).sendKeys("Addition problem");
			driver.findElement(By.name("ptype")).click();
			driver.findElement(By.name("ntype")).click();
			driver.findElement(By.name("ntype")).sendKeys("whole numbers");
			driver.findElement(By.name("ntype")).click();
			driver.findElement(By.name("maxnum")).click();
			driver.findElement(By.name("maxnum")).sendKeys("5");
			driver.findElement(By.name("minnum")).click();
			driver.findElement(By.name("minnum")).sendKeys("1");
			driver.findElement(By.name("subneg")).sendKeys("yes");
			driver.findElement(By.name("dplaces")).sendKeys("2");
			driver.findElement(By.name("mixedn")).sendKeys("yes");
			driver.findElement(By.name("count")).sendKeys("5");
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/p/input[1]")).click();

		}
		@Test(priority = 10)
		public void teardown() {
			driver.quit();
		}

}
