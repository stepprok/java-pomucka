package Matematika;

//Vytvoř program, který načte 10 čísel do pole a vypíše je v opačném pořadí.

public class Pracespoly_seznamy {
    public static void main(String[] args) {
        int[] cisla = {1, 2, 5, 8, 10, 20, 50, 100, 200, 500};

        System.out.println("Čísla v opačném pořadí:");

        // Cyklus od posledního prvku k prvnímu
        for (int i = cisla.length - 1; i >= 0; i--) {
            System.out.println(cisla[i]);
        }
    }
}

