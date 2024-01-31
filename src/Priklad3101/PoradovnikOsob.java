package Priklad3101;

import java.util.ArrayList;
import java.util.LinkedList;

public class PoradovnikOsob {
    private LinkedList<Osoba> list;

    public PoradovnikOsob() {
        list = new LinkedList<>();
    }

    public void pridajOsobuNaZaciatok(Osoba o) {
        list.addFirst(o);

    }

    public void pridajOsobuNaKoniec(Osoba o) {
        list.add(o);
    }

    Osoba getOsobuNaRade() {
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return null;
        }
    }

    public int getPocetCakajucich() {
        return list.size();
    }

    public void odstranOsobuNaRade() {
        list.removeFirst();
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
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getMeno() + " " + list.get(i).getRodneCislo());
        }
    }

}
