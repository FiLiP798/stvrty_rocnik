package Dedicnost;

public class Papagaj extends Zviera{
    private final int dlzkaPazurov;

    public Papagaj(long id, String meno, int dlzkaPazurov) {
        super(id, meno);
        this.dlzkaPazurov = dlzkaPazurov;
    }

    public int getDlzkaPazurov() {
        return dlzkaPazurov;
    }

    @Override
    public String vydajZvuk() {
        return "pakuj";
    }
}
