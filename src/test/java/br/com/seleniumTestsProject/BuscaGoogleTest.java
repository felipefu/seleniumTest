package br.com.seleniumTestsProject;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BuscaGoogleTest {

	private WebDriver driver;
	private GooglePage googlePaginaBusca;

	@Before
	public void inicializa() {
		//System.setProperty("webdriver.gecko.driver", "D:/Git/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "resources/firefoxGeckoDriver/v0.20.0/windows64/geckodriver.exe");
		this.driver = new FirefoxDriver();
		googlePaginaBusca = new GooglePage(driver);

	}
	
	@Test
	public void deveCadastrarUmLeilao() {

		googlePaginaBusca.abrirPagina();
		
        WebElement campoBusca = driver.findElement(By.id("lst-ib"));

        campoBusca.sendKeys("marmota");
        campoBusca.submit();
        
        boolean tem = driver.getPageSource().contains("marmota");
		
		//assertTrue(("Geladeira", 123, "Paulo Henrique", true));

	}
	
	@After
	public void finalizaTeste() {
		driver.close();
	}
}
