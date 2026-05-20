package org.example;

public class Bend {

        private String naziv;
        private double satnica;

        public Bend(String naziv, double satnica) {
            this.naziv = naziv;
            this.satnica = satnica;
        }

        public String getNaziv() {
            return naziv;
        }

        public double getSatnica() {
            return satnica;
        }

        public double izracunajZaradu(int brojSati) {
            return satnica * brojSati;
        }
    }

