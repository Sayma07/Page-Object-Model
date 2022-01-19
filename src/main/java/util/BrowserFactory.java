package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	static WebDriver driver; //This driver will go to loginTest page.
	static String browser = null;
	static String url = null;
	
	
	public static void readConfig() {
		Properties prop = new Properties();
		// FileReader //InputStream //BufferReader //Scanner

		try {
			InputStream input = new FileInputStream("src\\main\\java\\config\\config.properties");
			prop.load(input);
			browser = prop.getProperty("browser");
			System.out.println("Used Browser:" + browser);
			url = prop.getProperty("url");

}catch (IOException e) {

	e.printStackTrace();

}

}
	
	
	
	public static WebDriver	init() {

		/*
		 * System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		 * driver = new ChromeDriver();
		 * driver.get("https://www.techfios.com/billing/?ng=login/")
		 */;
		 readConfig();
		 
		 
		 if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("Fierfox")) {
				System.setProperty("webdriver.firefox.bin",
						"C:\\Users\\nazmu\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
				System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
				driver = new FirefoxDriver();
			}

			driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
}
	
public static void tearDown() {
	
	driver.close();
	driver.quit();
	
	
}	
}
