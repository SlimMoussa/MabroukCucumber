package Page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePageMabrouk {
	
	@FindBy(xpath = "//span[text()='Femme']")
	WebElement MenuFemme;

	@FindBy(xpath = "//span[text()='Chemises & Blouses']")
	WebElement SousMenuChemisesBlouses;
	
	@FindBy (xpath = "/html/body/div[5]/div[4]/div[2]/div[2]/div/h1")
	WebElement VerifTitre ;

	public HomePageMabrouk () {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void mouseHoverMenu() {
	    try {
	        Actions actions2 = new Actions(Config.driver);
	        actions2.moveToElement(MenuFemme).perform();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public void ClickOnMenu() {
	    try {
	        SousMenuChemisesBlouses.click();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public void VerifMenu (String TitraPage) {
		Config.Attente(10);
	    Assert.assertEquals(TitraPage, VerifTitre.getText());
	}
}
