package org.example;

import org.junit.Assert;
import org.junit.Test;

public class BioskopTest {

    @Test
    public void izracnuajCenuZaObicnuKartu() {
        Bioskop bioskop = new Bioskop();
        double cena = bioskop.izracunajCenuKarte(false, false, false);
        double ocekivano = 600;

        Assert.assertEquals(ocekivano, cena, 0);
    }
    @Test
    public void izracunajCenuZaDecijuKartu() {
        Bioskop bioskop = new Bioskop();
        double cena = bioskop.izracunajCenuKarte(true, false, false);
        double ocekivano = 400;
        Assert.assertEquals(ocekivano, cena, 0);
    }
    @Test
    public void izracunajDoplatuOdrasli3DProjekcija() {
        Bioskop bioskop = new Bioskop();
        double cena = bioskop.izracunajCenuKarte(false, true, false);
        double ocekivano = 800;
        Assert.assertEquals(ocekivano, cena, 0);
    }
    @Test
    public void izracunajZaOdrasleSaKuponom() {
        Bioskop bioskop = new Bioskop();
        double cena = bioskop.izracunajCenuKarte(false, false, true);
        double ocekivano = 500;
        Assert.assertEquals(ocekivano, cena, 0);
    }

    @Test
    public void izracunajZaDeteSa3DProjekcijomIKuponom() {
        Bioskop bioskop = new Bioskop();
        double cena = bioskop.izracunajCenuKarte(true, true, true);
        double ocekivano = 500;
        Assert.assertEquals(ocekivano, cena, 0);
    }
}