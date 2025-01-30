package dekorator;

public class Main {
    public static void main(String[] args) {
        LakierowanieSamochodu lakierowanie = new LakierowanieOsobowego();
        System.out.printf("1. %s (do dekorowania)%n Cena: %.2f PLN %n", lakierowanie.getOpis(), lakierowanie.getCena());

        lakierowanie = new OpcjaMetaliczne(lakierowanie);
        System.out.printf("2. %s (udekorowany)%n Cena: %.2f PLN%n", lakierowanie.getOpis(), lakierowanie.getCena());

        lakierowanie = new OpcjaZPlomieniami(lakierowanie);
        System.out.printf("3. %s (udekorowany)%n Cena: %.2f PLN%n", lakierowanie.getOpis(), lakierowanie.getCena());

        lakierowanie = new OpcjaZChromowaniem(lakierowanie);
        System.out.printf("4. %s (udekorowany)%n Cena: %.2f PLN%n", lakierowanie.getOpis(), lakierowanie.getCena());
    }
}
