package Matematika;

import java.util.Random;
import java.util.Scanner;

//Vygeneruj náhodné číslo mezi 1 a 100.

//Uživatel hádá číslo
//Program odpovídá „menší/větší“
//Po uhodnutí vypíše počet pokusů
//Použij Random rand = new Random(); rand.nextInt(100) + 1;.

public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int vasecislo = 0;
        int nahodnecislo = rand.nextInt(100) +1;
        int pokusy = 0;

        while (vasecislo != nahodnecislo)
        {
        System.out.println("Uhádněte: ");
        vasecislo = sc.nextInt();
        pokusy++;
        
        if (vasecislo < nahodnecislo)
        {
            System.out.println("Cislo je vetsi");
        } else if (vasecislo > nahodnecislo)
        {
            System.out.println("Cislo je mensi");
        } else {
            System.out.println("Spravne, uhodl si " +vasecislo+" za "+pokusy+"pokusu");
            sc.close();
        }
        }
    }
}
