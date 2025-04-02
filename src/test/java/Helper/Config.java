package Helper;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Config {
	
	public static WebDriver driver ;
		
	public static void ConfChrome () throws Exception {
		
		 //System.setProperty("webdriver.chrome.driver", Utils.getproprety("test_driver_path"));
		//driver = new ChromeDriver();
		String driverType = Utils.getproprety("webdriver.type");
		 if (driverType.equalsIgnoreCase("webdrivermanager")) {
	            // WebDriverManager gère automatiquement le téléchargement et la configuration
	            WebDriverManager.chromedriver().setup();
	        } else {
	            // Utilisation d'un chemin manuel défini dans le fichier config.properties
	            System.setProperty("webdriver.chrome.driver", Utils.getproprety("test_driver_path"));
	        }

	        driver = new ChromeDriver();
	    }
	
	public static void maximiseWindow() {
		driver.manage().window().maximize();
	}
	
	public static void Attente (int s) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}

	public static void CloseBrowser () {
		driver.quit();
	} 
}