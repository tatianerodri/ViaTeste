package metodos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	protected static WebDriver driver;
	 /**
	  * Metodo para abrir navegador chrome
	  * @param navegador
	  * @param site
	  */

	public void abrirNavegador(String site) {
		try {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			} catch (Exception e) {
			System.err.println("-------- erro ao abrir navegador--------" + e.getMessage());
			System.err.println("------ causa do erro -------" + e.getCause());
		}

	
}

}

