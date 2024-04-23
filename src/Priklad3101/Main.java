package Priklad3101;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Osoba> nacitajOsoby() {
        List<Osoba> osoby = new ArrayList<>();

        File subor = new File("osoby.txt");
        if (!subor.canRead()) {
            System.out.println("Subor sa neda citat");
            return null;
        }

        try {
            Scanner sc = new Scanner(subor);
            int pocet = sc.nextInt();
            for (int i = 0; i < pocet; i++) {
                int id = sc.nextInt();
                String rodneCislo = sc.next();
                String meno = sc.next();
                osoby.add(new Osoba(id,rodneCislo,meno));
            }


        } catch (FileNotFoundException e) {
            System.out.println("Subor sa nepodarilo otvorit");
            return null;
        } catch (InputMismatchException e) {
            System.out.println("Nespravny format suboru");
            return null;
        }

        return osoby;
    }

    public static void main(String[] args) {
        /*
        PoradovnikOsob poradovnikOsob = new PoradovnikOsob();
        Osoba o1 = new Osoba(1,"098765","Filip");
        Osoba o2 = new Osoba(2,"000000","Peter");
        Osoba o3 = new Osoba(3,"123456","Alex");

         */

        /*
        poradovnikOsob.pridajOsobuNaKoniec(o1);
        poradovnikOsob.pridajOsobuNaKoniec(o2);
        poradovnikOsob.pridajOsobuNaZaciatok(o3);

        poradovnikOsob.vypisVsetkyOsoby();
        System.out.println(poradovnikOsob.getPocetCakajucich());
        poradovnikOsob.odstranOsobuNaRade();
        System.out.println(poradovnikOsob.getPocetCakajucich());

        System.out.println(poradovnikOsob.getOsobuNaRade().getMeno());

         */

        List<Osoba> osoby = nacitajOsoby();
        if (osoby != null) {
            for (Osoba o: osoby) {
                System.out.println(o.toString());
            }
        }
    }
}
