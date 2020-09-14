package STASS2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebdriverTesting {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\imkar\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com/");
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("ak123kmr@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.id("ap_password")).sendKeys("12356SPD");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("AMD ryzen 5");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[3]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.id("nav-cart-count")).click();
		driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdown1_3\"]")).click();
		driver.findElement(By.xpath("//*//*[@id=\"sc-item-C5f3cf843-4cbd-44c6-a0c3-7cb3fd618079\"]/div[4]/div/div[1]/div/div/div[2]/div/span[2]/span/input")).click();
		driver.quit();
		
		

		//*[@id="nav-search"]/form/div[2]/div/input

	}

}
