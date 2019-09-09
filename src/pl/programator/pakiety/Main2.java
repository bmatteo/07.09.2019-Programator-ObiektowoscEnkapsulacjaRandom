package pl.programator.pakiety;

import java.util.Arrays;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        //zadanie z losowniem

        Random ran = new Random();
        int[] tab = new int[ran.nextInt(20)];

        int suma = 0;

        for(int i = 0; i < tab.length; i++) {
            tab[i] = ran.nextInt(50);
            suma = suma + tab[i];
        }

        System.out.println(Arrays.toString(tab));
        System.out.println("Średnia: " + ((double) suma)/((double) tab.length));

    }
}
