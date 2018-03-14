package br.com.seleniumTestsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class GooglePage {

    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void abrirPagina() {
        driver.get("http://www.google.com.br");
    }

}
