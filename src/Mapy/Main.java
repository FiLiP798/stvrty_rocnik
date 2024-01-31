package Mapy;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Osoba> arrayList = new ArrayList<>();
        arrayList.add(new Osoba("123","Larry"));
        arrayList.add(new Osoba("756","Jack"));
        arrayList.get(1);
        arrayList.add(0, new Osoba("098","Oliver"));

        /*
        LinkedList<Osoba> linkedList = new LinkedList<>();
        linkedList.add(new Osoba("123","Larry"));
        linkedList.add(new Osoba("756","Jack"));
        linkedList.get(1);
        linkedList.add(0,new Osoba("098","Oliver"));

         */

        DatabazaOsob databaza = new DatabazaOsob(arrayList);
        arrayList.clear();
        System.out.println(databaza.getPocetOsob());
    }
}
