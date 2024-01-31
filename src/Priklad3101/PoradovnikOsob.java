package Priklad3101;

import java.util.*;

public class PoradovnikOsob {
    private final LinkedList<Osoba> list;
    private Map<String, Osoba> indexMien;
    private Map<String, Osoba> indexRodnychCisiel;
    //private Deque<Osoba> poradovnik; / --> prípadne cez toto

    public PoradovnikOsob() {
        list = new LinkedList<>();
        indexMien = new HashMap<>();
        indexRodnychCisiel = new TreeMap<>();
    }

    public void pridajOsobuNaZaciatok(Osoba o) {
        list.addFirst(o);
        zaindexujOsobu(o);

    }

    public void pridajOsobuNaKoniec(Osoba o) {
        list.addLast(o);
        zaindexujOsobu(o);
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
        Osoba o = list.pollFirst();
        indexMien.remove(o.getMeno());
        indexRodnychCisiel.remove(o.getRodneCislo());
    }

    Osoba najdiPodlaMena(String meno) {
        /*
        for (Osoba osoba : list) {
            if (osoba.getMeno().equals(meno)) {
                return osoba;
            }
        }
         */

        return this.indexMien.get(meno);
    }

    Osoba najdiPodlaRodnehoCisla(String rodneCislo) {
        /*
        for (Osoba osoba : list) {
            if (osoba.getRodneCislo().equals(rodneCislo)) {
                return osoba;
            }
        }
         */

        return this.indexRodnychCisiel.get(rodneCislo);
    }

    public void vypisVsetkyOsoby() {
        for (Osoba osoba : list) {
            System.out.println(osoba.getMeno() + " " + osoba.getRodneCislo());
        }
    }

    private void zaindexujOsobu(Osoba o) {
        indexMien.put(o.getMeno(), o);
        indexRodnychCisiel.put(o.getRodneCislo(), o);
    }

}
