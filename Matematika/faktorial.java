package Matematika;

import java.util.Scanner;

//Napiš program, který vypočítá faktoriál čísla (n! = n * (n-1) * ... * 1) pomocí rekurze.

//Tip: Použij metodu, která volá sama sebe (if (n == 1) return 1;).

public class faktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte číslo n");
        int n = sc.nextInt();

        long faktorial = 1;
        for (int i = 1; i <= n; i++)
        {
            faktorial *= i;
        }

        System.out.println("Faktoriál čísla " +n+" je " +faktorial);
        sc.close();
    }
}
