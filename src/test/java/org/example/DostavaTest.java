package org.example;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class DostavaTest {

    Dostava dostava;

    @Before
    public void setUp() throws Exception {
        dostava = new Dostava();
        }
        // mvn test -Dtest=NazivKlase#nazivMetode
        @Test
        public void testOsnovneCeneDostave() {
            double cenaDostave = dostava.izracunajCenuDostave(1200, 3);
            Assert.assertEquals(300, cenaDostave, 0);
        }
        @Test
        public void testBesplatneDostaveRegularnaKilometraza() {
            Dostava dostava = new Dostava();
            double cenaDostave = dostava.izracunajCenuDostave(2500, 3);
            Assert.assertEquals(0, cenaDostave, 0);
        }

        @Test
        public void testBesplatneDostaveVecaKilometraza() {
            double cenaDostave = dostava.izracunajCenuDostave(2500, 10);
            Assert.assertEquals(0, cenaDostave, 0);
        }

        @Test
        public void testDoplataZaUdaljenost() {
            double cenaDostave = dostava.izracunajCenuDostave(1500, 7);
            Assert.assertEquals(400, cenaDostave, 0);
        }
    }

