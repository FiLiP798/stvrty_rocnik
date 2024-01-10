package Dedicnost;

public abstract class Zviera {
    private final long id;
    private final String meno;

    public Zviera(long id, String meno) {
        this.id = id;
        this.meno = meno;
    }

    public long getId() {
        return id;
    }

    public String getMeno() {
        return meno;
    }

    public abstract String vydajZvuk();
}
