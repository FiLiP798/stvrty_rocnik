package Priklad3101;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class PoradovnikOsob {
    private final LinkedList<Osoba> list;
    //private Deque<Osoba> poradovnik; / --> prípadne cez toto

    public PoradovnikOsob() {
        list = new LinkedList<>();
    }

    public void pridajOsobuNaZaciatok(Osoba o) {
        list.addFirst(o);

    }

    public void pridajOsobuNaKoniec(Osoba o) {
        list.addLast(o);
    }

    Osoba getOsobuNaRade() {
        /*
        if (!list.isEmpty()) {
            return list.getFirst();
        } else {
            return null;
        }

         */
        return this.list.peekFirst();
    }

    public int getPocetCakajucich() {
        return list.size();
    }

    public void odstranOsobuNaRade() {
        list.pollFirst();
    }

    Osoba najdiPodlaMena(String meno) {
        for (Osoba osoba : list) {
            if (osoba.getMeno().equals(meno)) {
                return osoba;
            }
        }
        return null;
    }

    Osoba najdiPodlaRodnehoCisla(String rodneCislo) {
        for (Osoba osoba : list) {
            if (osoba.getRodneCislo().equals(rodneCislo)) {
                return osoba;
            }
        }
        return null;
    }

    public void vypisVsetkyOsoby() {
        for (Osoba osoba : list) {
            System.out.println(osoba.getMeno() + " " + osoba.getRodneCislo());
        }
    }

}
