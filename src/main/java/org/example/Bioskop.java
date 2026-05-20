package org.example;

public class Bioskop {

        // obicna karta, decija karta, doplata 3d projekcija, kupon popust
        private static final double OSNOVNA_CENA = 600;
        private static final double DECIJA_CENA = 400;
        private static final double DOPLATA_3D = 200;
        private static final double POPUST_KUPON = 100;

        // bool dete, bool 3d, bool ima kupon
        public double izracunajCenuKarte(boolean dete, boolean projekcija3d, boolean imaKupon) {
            double cena;

            if (dete) {
                cena = DECIJA_CENA;
            } else {
                cena = OSNOVNA_CENA;
            }

            if (projekcija3d) {
                cena += DOPLATA_3D;
            }

            if (imaKupon) {
                cena -= POPUST_KUPON;
            }

            return cena;
        }
    }

