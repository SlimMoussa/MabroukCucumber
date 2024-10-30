package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Helper.Config;

public class ChemisesBlousesPage {
	
	@FindBy (xpath = "/html/body/div[5]/div[4]/div[4]/div/div[4]/div/ul/li/div/div[2]/h3/a")
	List <WebElement> MenuJB ;
	
	@FindBy (xpath = "/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/h1")
	WebElement VerifTitre ;
	
	
	public ChemisesBlousesPage () {
		PageFactory.initElements(Config.driver, this);
	}
	

	public void ClickOnMenuJB(String nameProduct) {
   
        try {
           
            for (WebElement menu : MenuJB) {
                if (menu.getText().contains(nameProduct)) {
                    Config.Attente(10); 
                    menu.click(); 
                    break; // Arrête la boucle une fois le produit trouvé
                }
            }
       
            
        } catch (Exception e) {
           
        }
    }
	
	
	public void VerifMenu (String TitraPage) {
		Config.Attente(10);
	    Assert.assertEquals(TitraPage, VerifTitre.getText());
	}
}	



