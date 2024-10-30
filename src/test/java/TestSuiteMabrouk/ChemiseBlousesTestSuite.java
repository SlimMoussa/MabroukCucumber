package TestSuiteMabrouk;

import Helper.Config;
import Page.ChemisesBlousesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChemiseBlousesTestSuite {
	
	
	@Given("Utilisateur est connécté sur la page maison connectée")
	public void utilisateur_est_connécté_sur_la_page_maison_connectée() throws Exception {
		Config.ConfChrome();
        Config.maximiseWindow();
        String url = "https://mabrouk.tn/categorie-produit/vetements-femmes/chemises-blouses/";
        Config.driver.get(url);
	}

	@When("Utilisateur clique sur le produit {string}")
	public void utilisateur_clique_sur_le_produit(String nameProduct) throws Exception {
		ChemisesBlousesPage page = new ChemisesBlousesPage();
		Config.Attente(10); 
		Thread.sleep(2000);
        page.ClickOnMenuJB(nameProduct);
	}

	@Then("Redirection vers la page du produit {string}")
	public void redirection_vers_la_page_du_produit(String expectedTitle) throws Exception {
		Config.Attente(10);
		ChemisesBlousesPage page = new ChemisesBlousesPage();
		page.VerifMenu(expectedTitle);
		Thread.sleep(2000);
        Config.CloseBrowser();
	}


}
