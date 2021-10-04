package blackboxtests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Teste1 {

	// WebDriver instance
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// location of drivers
		System.setProperty("webdriver.chrome.driver", "C:\\ISCTE\\Aulas\\DriversSelenium\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\ISCTE\\Aulas\\DriversSelenium\\geckodriver.exe");
		
		// create a new instance of the driver
		driver = new ChromeDriver(); 
		//driver = new FirefoxDriver();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// driver.close();   // close the tab it has opened
		// driver.quit();    // close the browser
	}

	@Test
	public void test() {
/*		// and now use this to visit Google. It should be https
		//driver.get("https://www.google.pt");
		driver.get("https://www.iscte-iul.pt/");
		
		// find the text input element by its name
		//WebElement element = driver.findElement(By.name("q"));
		
		WebElement element = driver.findElement(By.id("searchIcon"));
		element.click();
		// enter something to search for
		element = driver.findElement(By.id("searchAll"));
		element.sendKeys("LETI");
		
		// submit the form. WebDriver will find the form for us from the element
		element.submit();
		driver.close();*/
		
		driver.get("https://www.idealista.pt/arrendar-casas/lisboa/lumiar/");
		List<WebElement> Apartamentos = driver.findElements(By.className("item-price h2-simulated"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// check the title of the page
		System.out.println("Page title is: " + driver.getTitle());
		 for(WebElement apartamento:Apartamentos)  
			  System.out.println(apartamento);  
	}

}
