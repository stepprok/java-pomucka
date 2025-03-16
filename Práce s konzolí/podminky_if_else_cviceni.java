//Napiš program, který zjistí, jestli je zadané číslo sudé nebo liché. Pokud je sudé, vypíše: „Číslo je sudé.“ Pokud je liché, vypíše: „Číslo je liché.“

public class podminky_if_else_cviceni {
    public static void main(String[] args) {
        int x = 0;

        if (x % 2 == 0)
        {
            System.out.println("Číslo je sudé.");
        } else {
            System.out.println("Číslo je liché.");
        }
    }
}
