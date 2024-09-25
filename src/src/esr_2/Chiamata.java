package esr_2;
    public class Chiamata {
        private String numeroChiamato;
        private int durata;

        //costrutto che mi serve per avere uno stampino da richiamare
        public Chiamata(String numChiamato, int durata) {
            this.numeroChiamato = numChiamato;
            this.durata = durata;
        }

        public String getNumeroChiamato() {
            return this.numeroChiamato;
        }

        public int getDurata() {
            return this.durata;
        }

    }

