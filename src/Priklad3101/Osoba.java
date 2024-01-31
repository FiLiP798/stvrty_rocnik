package Priklad3101;

public class Osoba {
    private String rodneCislo;
    private String meno;

    public Osoba(String rodneCislo, String meno) {
        this.rodneCislo = rodneCislo;
        this.meno = meno;
    }

    public String getMeno() {
        return meno;
    }

    public String getRodneCislo() {
        return rodneCislo;
    }
}
