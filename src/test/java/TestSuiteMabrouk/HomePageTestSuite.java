package TestSuiteMabrouk;

import Helper.Config;
import Helper.Utils;
import Page.HomePageMabrouk;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTestSuite {
	
	@Given("Utilisateur  sur la Page dacceuil")
	public void utilisateur_sur_la_page_dacceuil() throws Exception {
		Config.ConfChrome();
        Config.maximiseWindow();
        Config.driver.get(Utils.getproprety("Web_portal_link"));
	}

	@When("je survole le MenuHaut {string} et Cliquer Sur {string}")
	public void je_survole_le_menu_haut_et_cliquer_sur(String x, String y) throws Exception {
		HomePageMabrouk page = new HomePageMabrouk();
		Config.Attente(10);
        page.mouseHoverMenu();
        Thread.sleep(5000);
        page.ClickOnMenu();
	}
	
	@Then("La page est affiché {string}")
	public void la_page_est_affiché(String expectedTitle) throws Exception {
		Config.Attente(10);
		HomePageMabrouk page = new HomePageMabrouk();
		page.VerifMenu(expectedTitle); 
		Thread.sleep(2000);
        Config.CloseBrowser();
	}
}
