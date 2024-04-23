package Priklad3101;

public class Osoba {
    private int id;
    private String rodneCislo;
    private String meno;

    public Osoba(int id, String rodneCislo, String meno) {
        this.id = id;
        this.rodneCislo = rodneCislo;
        this.meno = meno;
    }

    public int getId() {
        return id;
    }

    public String getMeno() {
        return meno;
    }

    public String getRodneCislo() {
        return rodneCislo;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "id=" + id +
                ", rodneCislo='" + rodneCislo + '\'' +
                ", meno='" + meno + '\'' +
                '}';
    }
}
