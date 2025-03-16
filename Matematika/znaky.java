package Matematika;

import java.util.Scanner;

//Práce s řetězci (počet znaků, reverzní řazení, počet samohlásek)
//Požádej uživatele o text a:

//Spočítej počet znaků
//Otoč text pozpátku
//Spočítej počet samohlásek (a, e, i, o, u)

//Použij charAt(i) pro procházení znaků.

public class znaky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Váš text: ");
        String text = sc.nextLine();

        int pocetznaku = text.length();
        
        System.out.println("Váš text obsahuje: " + pocetznaku + " znaků");

        String otoceny = new StringBuilder(text).reverse().toString();

        System.out.println("Váš text pozpátku je: "+otoceny);

        int pocetsamohlasek = 0;
        String samohlasky = "aeiouáéíóúů";

        for (int i = 0; i < text.length(); i++)
        {
            char znak = text.charAt(i);

            if (samohlasky.indexOf(znak) != -1) 
            {
                pocetsamohlasek++;
            }
        }

        System.out.println("Počet samohlásek je: " +pocetsamohlasek);

        sc.close();
    }
}
