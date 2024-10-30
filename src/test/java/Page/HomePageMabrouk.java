package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePageMabrouk {
	
	@FindBy (xpath = "/html/body/div[4]/header/div/div/div[2]/nav/div/div[3]/div[1]/ul/li/a/span")
	List <WebElement> MenuHaut ;

	@FindBy (xpath = "/html/body/div[5]/header/div/div[3]/nav/div/div[3]/div[1]/ul/li[4]/div/ul/li/a/span")
	List <WebElement> SousMenuHaut ;
	
	@FindBy (xpath = "/html/body/div[5]/div[4]/div[2]/div[2]/div/h1")
	WebElement VerifTitre ;

	public HomePageMabrouk () {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void mouseHoverMenu (String menuTitle) {
	    try {
	        Actions actions2 = new Actions(Config.driver);
	        Config.Attente(10); 
	        for (WebElement menu : MenuHaut) {
	            if (menu.getText().contains(menuTitle)) {
	                actions2.moveToElement(menu).perform(); 
	            }
	        }   
	    } catch (Exception e) {
	        
	    }   
	}
	
	public void ClickOnMenu(String submenutitle) {
	    try {
	    	 for (WebElement SubMenu: SousMenuHaut)	{
	    			if (SubMenu.getText().contains(submenutitle))
	    				Config.Attente(10);
	    			Thread.sleep(3000); 
	    				SubMenu.click();
	            }  
	    } catch (Exception e) { 
	    }
	}
	
	public void VerifMenu (String TitraPage) {
		Config.Attente(10);
	    Assert.assertEquals(TitraPage, VerifTitre.getText());
	}
	
}
