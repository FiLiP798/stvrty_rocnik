package Priklad3101;

public class Main {
    public static void main(String[] args) {
        PoradovnikOsob poradovnikOsob = new PoradovnikOsob();
        Osoba o1 = new Osoba("040915","Filip");
        Osoba o2 = new Osoba("000000","Peter");
        Osoba o3 = new Osoba("123456","Alex");

        poradovnikOsob.pridajOsobuNaKoniec(o1);
        poradovnikOsob.pridajOsobuNaKoniec(o2);
        poradovnikOsob.pridajOsobuNaZaciatok(o3);

        poradovnikOsob.vypisVsetkyOsoby();
        System.out.println(poradovnikOsob.getPocetCakajucich());
        poradovnikOsob.odstranOsobuNaRade();
        System.out.println(poradovnikOsob.getPocetCakajucich());

        System.out.println(poradovnikOsob.getOsobuNaRade().getMeno());


    }
}
