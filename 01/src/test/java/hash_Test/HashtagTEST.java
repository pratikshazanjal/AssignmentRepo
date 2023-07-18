package hash_Test;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

import hash_POM.Hash_POM;

public class HashtagTEST {
	WebDriver driver;
	Hash_POM hp;
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("OpenBrowser & Enter URL");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MY PC\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
		driver.manage().window().maximize();
		
	}
	@org.testng.annotations.Test
	public void Test() throws InterruptedException
	{
		hp= new Hash_POM(driver);
		hp.ScrollInto(driver);
		hp.EnterName();
		hp.EnterEmail();
		hp.EnterMobile();
		hp.ClickOnChoose();
		hp.EnterDesc();
		hp.ClickOnApply();
		
	}

}
