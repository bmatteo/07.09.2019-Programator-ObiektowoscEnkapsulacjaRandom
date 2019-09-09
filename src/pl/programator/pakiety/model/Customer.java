package pl.programator.pakiety.model;

import pl.programator.pakiety.model2.InneDane;

public class Customer {
    public DaneOsobowe mojaNazwaZmiennej;
    public double stanKonta;
    long numerKonta;
    private int id;
    public InneDane inneDane;


    public void wydajKase(double wydanaKwota) {
        stanKonta = stanKonta - wydanaKwota;
        id = 6;
    }

    public String polaczImieINazwisko() {
        DaneOsobowe d = new DaneOsobowe();
        d.imie = "ABC";
        return mojaNazwaZmiennej.imie + " " + mojaNazwaZmiennej.nazwisko;
    }

    public static class DaneOsobowe {
        private String imie;
        public String nazwisko;
        public int rok;
        public int pesel;

        public int abc() {
            Customer c = new Customer();
            return c.id;
        }
    }
}
