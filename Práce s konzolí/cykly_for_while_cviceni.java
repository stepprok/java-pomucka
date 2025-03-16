//Napiš program, který vypíše všechna čísla od 1 do 10 pomocí for cyklu.
//Pak udělej to samé s while cyklem.

public class cykly_for_while_cviceni {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++)
        {
            System.out.println("I je " + i);
        }

        int j = 0;

        while (j <= 10) {
            System.out.println("J je " +j);
            j++;
        }
    }   
}
