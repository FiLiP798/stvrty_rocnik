package Dedicnost;

import java.util.ArrayList;

public class ZvieraciaKlinika {
    private final ArrayList<Zviera> zvierata;

    public ZvieraciaKlinika() {
        this.zvierata = new ArrayList<>();
    }

    public void pridajZviera(Zviera zviera) {
        this.zvierata.add(zviera);
    }

    public void vypisMena(){
        for (Zviera z: this.zvierata) {
            System.out.println(z.getMeno());
        }
    }

    public void odpocuvajZvierata() {
        for (Zviera z : this.zvierata) {
            System.out.println(z.vydajZvuk());
        }
    }
}
