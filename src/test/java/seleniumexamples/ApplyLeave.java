package seleniumexamples;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ApplyLeave {
	WebDriver driver = new ChromeDriver();
	void login()
	{
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	void search(String userName)
	{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(userName);
		;////input[@clas='oxd-input oxd-input--active']
	}
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Jeevan\\chromedriver.exe");
		ApplyLeave aa=new ApplyLeave();
		aa.login();
		aa.search("jeevan");
		aa.search("Admin", "ok");					
	}
	public void search (String userrole , String empName)
	{
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).click();
		driver.findElement(By.xpath("//form//div[3]//input")).sendKeys(empName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
