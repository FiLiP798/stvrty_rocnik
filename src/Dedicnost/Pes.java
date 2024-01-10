package Dedicnost;

import java.util.ArrayList;
import java.util.List;

public class Pes extends Zviera{
    private List<String> prikazy;

    public Pes(long id, String meno) {
        super(id,meno);
        this.prikazy = new ArrayList<>();
        this.prikazy.add("sadni");
        this.prikazy.add("lahni");
        this.prikazy.add("cuvaj");
    }

    public List<String> getPrikazy() {
        return prikazy;
    }

    @Override
    public String vydajZvuk() {
        return "haf voof";
    }

    @Override
    public String getMeno() {
        return super.getMeno() + " woof woof";
    }
}
