package pl.programator.pakiety;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int tab[] = new int[10];

        for(int i = 0; i < tab.length; i++) {
            if((i % 2) == 0) {
                tab[i] = i+1;
            } else {
                tab[i] = i;
            }
        }
        System.out.println(Arrays.toString(tab));

        Random random = new Random();
        System.out.println(-random.nextInt(10));
    }
}
