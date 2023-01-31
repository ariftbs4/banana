package sampleframework2;

public class BestTest {
	ChromeDriver driver = null;
	   public ChromeDriver getDriver() {
	           driver = new ChromeDriver();
	           driver.get("http://www.express.com");
	           driver.manage().window().maximize();
	           driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	           return driver;
	   }
	   public void closeBrowser() {
	           driver.quit();

	}
}
