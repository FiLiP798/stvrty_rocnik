package Pisomky.pisomka27_03;

public class Papaja {
    private int hmotnost;
    private String identifikator;

    public Papaja(int hmotnost, String identifikator) {
        this.hmotnost = hmotnost;
        this.identifikator = identifikator;
    }

    public int getHmotnost() {
        return hmotnost;
    }

    public String getIdentifikator() {
        return identifikator;
    }

    @Override
    public String toString() {
        return "Papaja{" +
                "hmotnost=" + hmotnost +
                ", identifikator='" + identifikator + '\'' +
                '}';
    }
}
