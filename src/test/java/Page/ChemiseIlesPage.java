package Page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class ChemiseIlesPage {
	
	
	@FindBy (xpath = "/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[3]/div[3]/span")
	WebElement Couleur ;
	
	@FindBy (xpath = "/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[2]/div[3]/span[5]")  
	WebElement Taille ;
	
	@FindBy (xpath = "/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[2]/div[2]/a")  
	WebElement AjoutPanier ;
	
	@FindBy (xpath = "/html/body/div[5]/header/div/div[1]/ul[2]/li[3]/a/span/svg/path")  
	WebElement BoutonPanier ;
	
	@FindBy (xpath = "/html/body/div[5]/header/div/div[1]/ul[2]/li[3]/div[1]/div[2]/ul/li/div/a")
	WebElement VerifProduitPanier ;
	
	
	public ChemiseIlesPage () {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void Cliquersurcouleur () throws Exception {
		Couleur.click();
		Thread.sleep(3000);
		
	}
	
	public void Cliquersurtaille() throws InterruptedException  {
		Taille.click();
		Thread.sleep(3000);
                }
	
	public void Cliquersurajoutpanier() throws InterruptedException  {
		AjoutPanier.click();
		Thread.sleep(3000);
                }
	public void Cliquersurboutonpanier() throws InterruptedException  {
		BoutonPanier.click();
		Thread.sleep(3000);
                }
	public void VerifMenu (String TitraPage) {
		Config.Attente(10);
	    Assert.assertEquals(TitraPage, VerifProduitPanier.getText());
	}
}
