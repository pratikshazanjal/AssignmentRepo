package hash_POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hash_POM {
	@FindBy (xpath="//span[text()='Join us']")
	private WebElement scroll;

	
	@FindBy (xpath="(//input[@type='text'])[2]")
	private WebElement Name;

	@FindBy (xpath="(//input[@class='form-control hash-input'])[3]")
	private WebElement Email;

	@FindBy (xpath="//input[@name='phone']")
	private WebElement Mobileno;

	@FindBy (xpath="//input[@name='resume']")
	private WebElement Choosefile;

	@FindBy (xpath="//textarea[@name='description']")
	private WebElement Description;
	
	@FindBy (xpath="//button[text()='APPLY NOW']")
	private WebElement Apply;
	
	public Hash_POM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ScrollInto(WebDriver driver )
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scroll);
	}
	public void EnterName()
	{
		Name.sendKeys("Pratiksha Zanjal");
	}
	public void EnterEmail()
	{
		Email.sendKeys("pratikshazanjal7gmail.com");
	}
	public void EnterMobile()
	{
		Mobileno.sendKeys("9579774800");
	}
	public void ClickOnChoose()
	{
		Choosefile.sendKeys("C:\\Users\\MY PC\\Desktop\\Pratiksha Zanjal CV.pdf");
	}
	public void EnterDesc()
	{
		Description.sendKeys("I have 3+ years of experience in manual as well as automation testing.");
	}
	public void ClickOnApply()
	{
		Apply.click();
	}

}
