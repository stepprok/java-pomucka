class Auto {
    String znacka;
    
    public Auto(String znacka) {
        this.znacka = znacka;
    }
    
    public void predstavSe() {
        System.out.println("Jsem auto značky " + znacka);
    }
}

public class tridy_objekty {
    public static void main(String[] args) {
        Auto mojeAuto = new Auto("Škoda");
        mojeAuto.predstavSe();
    }
}
