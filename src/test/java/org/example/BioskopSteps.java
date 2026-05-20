package org.example;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class BioskopSteps {

    private boolean dete;
    private boolean projekcija3d;
    private boolean imaKupon;
    private double cena;

    @Given("korisnik nije dete {word}")
    public void korisnik_nije_dete(String word) {
        this.dete = Boolean.parseBoolean(word);
    }
    @Given("projekcija nije 3d {word}")
    public void projekcija_nije_3d(String word) {
        // Write code here that turns the phrase above into concrete actions
        this.projekcija3d = Boolean.parseBoolean(word);;
    }
    @Given("korisnik nema kupon {word}")
    public void korisnik_nema_kupon(String word) {
        this.imaKupon = Boolean.parseBoolean(word);
    }
    @When("izracuna cenu karte")
    public void izracuna_cenu_karte() {
        Bioskop bioskop = new Bioskop();
        this.cena = bioskop.izracunajCenuKarte(dete, projekcija3d, imaKupon);
    }
    @Then("cena karte treba da bude {double}")
    public void cena_karte_treba_da_bude(Double ocekivano) {
        Assert.assertEquals(ocekivano, cena, 0);
    }
}