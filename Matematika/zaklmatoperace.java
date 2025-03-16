package Matematika;

import java.util.Scanner;

//Napiš program, který načte 5 čísel od uživatele a vypíše:

//Součet
//Průměr
//Nejmenší číslo
//Největší číslo
//Použij Math.min() a Math.max().


public class zaklmatoperace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. číslo: ");
        int cislo = sc.nextInt();
        System.out.println("2. číslo: ");
        int cislo2 = sc.nextInt();
        System.out.println("3. číslo: ");
        int cislo3 = sc.nextInt();
        System.out.println("4. číslo: ");
        int cislo4 = sc.nextInt();
        System.out.println("5. číslo: ");
        int cislo5 = sc.nextInt();

        int[] cisla = {cislo, cislo2, cislo3, cislo4, cislo5};

        int soucet = 0;

        for (int i = 0; i < cisla.length; i++)
        {
            soucet += cisla[i];
        }

        System.out.println("Soucet: "+ soucet);

        double prumer = (double) soucet / cisla.length;

        System.out.println("Prumer: "+prumer);

        int nejmensi = Math.min(cislo, Math.min(cislo2, Math.min(cislo3, Math.min(cislo4, cislo5))));

        System.out.println("Nejmensi cislo: " +nejmensi);

        int nejvetsi = Math.max(cislo, Math.max(cislo2, Math.max(cislo3, Math.max(cislo4, cislo5))));

        System.out.println("Nejvetsi cislo: "+ nejvetsi);

        sc.close();
    }
}
