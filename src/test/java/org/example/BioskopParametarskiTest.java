package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BioskopParametarskiTest {

    private String nazivScenarija;

    private boolean dete;
    private boolean projekcija3D;
    private boolean imaKupon;

    private double ocekivanaCena;

    public BioskopParametarskiTest(String nazivScenarija, boolean dete, boolean projekcija3D, boolean imaKupon, double ocekivanaCena) {
        this.nazivScenarija = nazivScenarija;
        this.dete = dete;
        this.projekcija3D = projekcija3D;
        this.imaKupon = imaKupon;
        this.ocekivanaCena = ocekivanaCena;
    }

    @Parameterized.Parameters(name = "{0}")
    public static Collection<Object[]> podaciZaTest() {
        return Arrays.asList(new Object[][]{
                {"Odrasli, obicna karta", false, false, false, 600},
                {"Dete, obicna karta", true, false, false, 400},
                {"Odrasli, 3D", false, true, false, 800},
                {"Odrasli, sa kuponom",false, false, true, 500},
                {"Dete - 3D" ,true, true, false, 600},
                {"Dete - kupon", true, false, true, 300},
                {"Odrasli, 3D, kupon", false, true, true, 700},
                {"Dete, 3D, kupon", true, true, true, 500}
        });
    }

    // Definisemo unit test - koji ce biti popunjen podacima
    @Test
    public void izracunajCenuKarteZaRazliciteKombinacije() {
        Bioskop bioskop = new Bioskop();
        double cena = bioskop.izracunajCenuKarte(dete, projekcija3D, imaKupon);
        Assert.assertEquals(ocekivanaCena, cena, 0);
    }
}

// Samo za podsetnik
//        dete    |   projekcija3D   |   imaKupon     | ocekivana cena
//         false	   false	         false          600
//        true        false              false          400
//        false       true               false          800
//        false       false              true           500
//        true        true               false          600
//        true        false              true           300
//        false       true               true           700
//        true        true               true           500
