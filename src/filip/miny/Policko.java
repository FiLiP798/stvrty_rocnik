package filip.miny;

public class Policko implements IPopisPolicka{
    // atributy
    private boolean jeOdkryte;
    private boolean jeOznacene;
    private boolean maMinu;
    private int pocet_min_okolo;

    // konstruktor
    public Policko(boolean maMinu, int pocet_min_okolo) {
        this.maMinu = maMinu;
        this.pocet_min_okolo = pocet_min_okolo;
        this.jeOdkryte = false;
        this.jeOznacene = false;
    }

    // metody
    public void odkrySa() {
        this.jeOdkryte = true;
    }

    public void oznacSa() {
        this.jeOznacene = true;
    }

    public void odznacSa() {
        this.jeOznacene = false;
    }

    public int getPocet_min_okolo() {
        return pocet_min_okolo;
    }

    public boolean jeOdkryte() {
        return jeOdkryte;
    }

    public boolean jeOznacene() {
        return jeOznacene;
    }

    public boolean maMinu() {
        return maMinu;
    }
}
