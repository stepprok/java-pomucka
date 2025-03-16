//Vytvoř pole pěti čísel, sečti je a vypiš výsledek.
//pro {1, 2, 3, 4, 5} by měl program vypsat Součet: 15.

public class pole_seznamy_cviceni {
    public static void main(String[] args) {
        int[] cisla = {1,2,3,4,5};

        int soucet = 0;

        for (int i = 0; i < cisla.length; i++)
        {
            soucet += cisla[i];
        }

        System.out.println("Soucet je " + soucet);
    }
}
