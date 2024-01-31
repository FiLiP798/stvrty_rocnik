package Mapy;

import java.util.ArrayList;
import java.util.List;

public class DatabazaOsob {
    private List<Osoba> zoznamOsob;

    public DatabazaOsob(List<Osoba> zoznamOsob) {
        this.zoznamOsob = new ArrayList<>();
        for (Osoba o :zoznamOsob) {
            this.zoznamOsob.addAll(zoznamOsob);
        }
    }

    public int getPocetOsob() {
        return this.zoznamOsob.size();
    }

    public void pridajOsobu(Osoba osoba) {
        this.zoznamOsob.add(osoba);
    }

    public Osoba najdiPodlaCisla(String cislo) {
        return null;
    }
}
