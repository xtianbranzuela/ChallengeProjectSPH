import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Challenge  {

	  //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	  // System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");

	  WebDriver driver = new ChromeDriver();

@Test
	public void step1Login(){

		driver.get("http://straitstimes.com/");  
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("j_username")).sendKeys("digitaltest2");
		driver.findElement(By.name("j_password")).sendKeys("Sphdigital1");
		driver.findElement(By.name("login")).click();
		System.out.println("Login is successful");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	@Test
    public void step2Validations () {
              
        driver.findElement(By.name("login-user-name"));
		driver.findElement(By.className("block-link"));
		driver.findElement(By.className("block-link")).click();
		System.out.println("Link is opened");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.className("vjs-poster"));

	}
	

}
