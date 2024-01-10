package Pisomky.pisomka20_12;

import java.util.ArrayList;

public class PozicovnaKavovarov {
    private ArrayList<Kavovar> kavovary = new ArrayList<>();

    public PozicovnaKavovarov() {
        Kavovar kavovar1 = new Kavovar(500,true);
        Kavovar kavovar2 = new Kavovar(750,false);
        kavovary.add(kavovar1);
        kavovary.add(kavovar2);
    }

    public int pocetKavovarov() {
        return this.kavovary.size();
    }

    public int pocetKavovarov(int paObjem) {
        int pocet = 0;
        for (Kavovar k : kavovary) {
            if (k.getObjemNadrze() > paObjem) {
                pocet++;
            }
        }
        return pocet;
    }

    public void vypisInfo() {
        for (Kavovar k : kavovary) {
            System.out.printf("Kávovar %d: %s \n",(kavovary.indexOf(k)+1),k);
        }
    }
}
