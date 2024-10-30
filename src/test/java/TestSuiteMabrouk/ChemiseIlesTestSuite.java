package TestSuiteMabrouk;

import Helper.Config;
import Page.ChemiseIlesPage;
import Page.ChemisesBlousesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChemiseIlesTestSuite {
	@Given("Utilisateur est connécté sur la page produit")
	public void utilisateur_est_connécté_sur_la_page_produit() throws Exception {
		Config.ConfChrome();
        Config.maximiseWindow();
        String url = "https://mabrouk.tn/produit/chemise-iles/";
        Config.driver.get(url);
	}

	@When("Utilisateur clique sur le couleur , la taille et ajouter au panier")
	public void utilisateur_clique_sur_le_couleur_la_taille_et_ajouter_au_panier() throws Exception {
		ChemiseIlesPage page = new ChemiseIlesPage();
		Config.Attente(10); 
	Thread.sleep(3000);
        page.Cliquersurcouleur();
        page.Cliquersurtaille();
	}

	@When("Utilisateur clique sur Bouton Panier")
	public void utilisateur_clique_sur_bouton_panier() throws Exception {
		ChemiseIlesPage page = new ChemiseIlesPage();
		Config.Attente(10); 
	Thread.sleep(3000);
        page.Cliquersurboutonpanier();
	}

	@Then("Vérifier si le produit est dans le panier {string}")
	public void vérifier_si_le_produit_est_dans_le_panier(String expectedTitle) throws Exception {
		Config.Attente(10);
		ChemisesBlousesPage page = new ChemisesBlousesPage();
		page.VerifMenu(expectedTitle);
		Thread.sleep(2000);
        Config.CloseBrowser();
	}
}
