package org.example;

public class Dostava {

        private final static double OSNOVNA_CENA = 300;
        private final static double GRANICA_ZA_BESPL_DOSTAVU = 2000;
        private final static double DOPLATA_ZA_UDALJENOST = 100;
        private final static double MAKSIMALNA_BESPL_UDALJENOST = 5;

        public double izracunajCenuDostave(double iznosPorudzbine, double udaljenost) {
            if (iznosPorudzbine >= GRANICA_ZA_BESPL_DOSTAVU) {
                return 0;
            }
            if (udaljenost > MAKSIMALNA_BESPL_UDALJENOST) {
                return OSNOVNA_CENA + DOPLATA_ZA_UDALJENOST;
            }
            return OSNOVNA_CENA;
        }
    }
