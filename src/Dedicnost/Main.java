package Dedicnost;

public class Main {
    public static void main(String[] args) {
        Pes pes = new Pes(1,"Rex");
        Papagaj papagaj = new Papagaj(2,"Jozef",4);

        ZvieraciaKlinika klinika = new ZvieraciaKlinika();

        klinika.pridajZviera(pes);
        klinika.pridajZviera(papagaj);
        //klinika.vypisMena();
        klinika.odpocuvajZvierata();

        System.out.println(pes.getMeno());
    }
}
