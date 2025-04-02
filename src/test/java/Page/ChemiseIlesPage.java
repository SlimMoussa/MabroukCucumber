package Page;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class ChemiseIlesPage {
	
	
	@FindBy (xpath = "/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[3]/div[3]/span[1]")
	WebElement Couleur ;
	
	@FindBy (xpath = "/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[2]/div[3]/span[3]")  
	WebElement Taille ;
	
	@FindBy(xpath = "/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[2]/div[2]/a")
	WebElement AjoutPanier;
	
	@FindBy(xpath = "/html/body/div[5]/header/div/div[1]/ul[2]/li[3]/div[1]/div[2]/div/p[2]/a[1]")
	WebElement BoutonPanier;
	
	@FindBy(xpath = "/html/body/div[4]/div[4]/div[4]/div/div/main/article/div/div/div[2]/div/form/div[1]/div/div[2]/div[1]/div/a")
	WebElement VerifProduitPanier;
	
	
	public ChemiseIlesPage () {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void Cliquersurcouleur () throws Exception  {
		Couleur.click();
		Thread.sleep(3000);
	}
	
	public void Cliquersurtaille() throws Exception  {
		Taille.click();
		Thread.sleep(3000);
                }
	
public void Cliquersurajoutpanier() throws Exception {
	AjoutPanier.click();
	Thread.sleep(3000);
}
	
	public void Cliquersurboutonpanier() {
	    WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(BoutonPanier));
	    BoutonPanier.click();
	}
	
	public void VerifMenu(String TitraPage) {
	    String actualText = VerifProduitPanier.getText().trim();
	    Assert.assertEquals("Le produit dans le panier est incorrect", TitraPage, actualText);
	}
}