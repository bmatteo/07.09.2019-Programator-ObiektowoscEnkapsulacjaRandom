package pl.programator.pakiety;

import pl.programator.pakiety.model.Customer;

public class Main3 {
    public static void main(String[] args) {
        Customer mojKlient = new Customer();

        mojKlient.mojaNazwaZmiennej = new Customer.DaneOsobowe();
        mojKlient.mojaNazwaZmiennej.nazwisko = "Kowalski";
        mojKlient.mojaNazwaZmiennej.pesel = 123;
        mojKlient.mojaNazwaZmiennej.rok = 1999;
        mojKlient.stanKonta = 4.4;

        System.out.println(mojKlient.stanKonta);

        mojKlient.wydajKase(3.4);

        System.out.println(mojKlient.stanKonta);

        System.out.println(mojKlient.polaczImieINazwisko());
    }
}
