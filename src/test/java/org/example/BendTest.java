package org.example;

import junit.framework.Assert;
import org.junit .*;

public class BendTest {

    private Bend bend;

        @Before
        public void setUp() {
            bend = new Bend("U2", 200);
        }

        @After
        public void tearDown() {
            bend = null;
        }

        @BeforeClass
        public static void setUpClass() {
            System.out.println("setUpClass - pre svih test metoda");
        }

        @AfterClass
        public static void tearDownClass() {
            System.out.println("tearDownClass - nakon svih test metoda");
        }

        @Test
        public void izracunajZaraduZa3Sata() {
            double ocekivanaZarada = 600;
            double dobijenaZarada = bend.izracunajZaradu(3);

            Assert.assertEquals(ocekivanaZarada, dobijenaZarada, 0.01);
        }

        @Test
        public void izracnajZa0Sati() {
            // Given / Arrange
            double ocekivanaZarada = 0;
            // When / Act
            double dobijenaZarada = bend.izracunajZaradu(0);
            // Then / Assert
            Assert.assertEquals(ocekivanaZarada, dobijenaZarada, 0);
        }

        @Test
        public void izracunajZaraduSaDecimalnomSatnicom() {
            double zarada = bend.izracunajZaradu(2);

            Assert.assertEquals(400.0, zarada, 0.001);
        }
    }