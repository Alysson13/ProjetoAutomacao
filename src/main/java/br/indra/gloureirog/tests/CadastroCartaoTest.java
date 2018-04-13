package br.indra.gloureirog.tests;

import static br.indra.gloureirog.core.DriverFactory.getDriver;

import br.indra.gloureirog.core.BasePage;
import br.indra.gloureirog.core.BaseTest;
import br.indra.gloureirog.core.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CadastroCartaoTest {

	BasePage page = new BasePage();
	
	/*---- CT01 ----*/

	@Given("^CT01 - Pagina principal$")
	public void acessarPaginaCadastro() throws Throwable {
		getDriver().get("http://www.bancoripley.com.pe/bancoripley/home/index.html");
		BaseTest.finaliza();
	}

	@When("^CT01 - Prints tela de tarjetas$")
	public void clicarTarjeta() throws Throwable {
		
		page.mouseHover("m_creditos","MMMenu0805194703_0_Item_0");
		Thread.sleep(5000);
		BaseTest.finaliza();
		
		page.mouseHover("m_creditos", "MMMenu0805194703_0_Item_1");
		Thread.sleep(5000);
		BaseTest.finaliza();
		
		page.mouseHover("m_creditos", "MMMenu0805194703_0_Item_2");
		Thread.sleep(5000);
		BaseTest.finaliza();
		
		page.mouseHover("m_creditos", "MMMenu0805194703_0_Item_3");
		Thread.sleep(5000);
		BaseTest.finaliza();
		
		page.mouseHover("m_creditos", "MMMenu0805194703_0_Item_4");
		Thread.sleep(5000);
		BaseTest.finaliza();
		
		page.mouseHover("m_creditos", "MMMenu0805194703_0_Item_5");
		Thread.sleep(5000);
		BaseTest.finaliza();
		DriverFactory.killDriver();
	}
	

	
	/*---- CT001 ----*/
	

}
