//Cvičení - Napiš program, který požádá uživatele o jméno a věk. Pak vypíše: „Ahoj [jméno], je ti [věk] let.“

import java.util.Scanner;

public class praceskonzolicviceni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jméno: ");
        String jmeno = sc.nextLine();

        System.out.println("Věk: ");
        int vek = sc.nextInt();

        System.out.println("Ahoj " + jmeno + ", je ti " + vek + "let");

        sc.close();
    }
}
