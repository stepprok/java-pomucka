//Vytvoř třídu Osoba, která bude mít atributy jmeno a vek.
//V konstruktoru nastav hodnoty a přidej metodu predstavSe(), která vypíše „Jmenuji se [jméno] a je mi [věk] let.“
//Ve main() vytvoř objekt a zavolej tuto metodu.

//Tip: Budeš potřebovat konstruktor a metodu.

class Osoba
{
    String jmeno;
    int vek;

    public Osoba(String jmeno, int vek)
    {
        this.jmeno = jmeno;
        this.vek = vek;
    }

    public void predstavSe()
    {
        System.out.println("Jmenuji se "+jmeno+" a je mi "+vek+" let.");
    }
    
}

public class tridy_objety_cviceni {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Petr", 27);

        osoba1.predstavSe();
    }
}
