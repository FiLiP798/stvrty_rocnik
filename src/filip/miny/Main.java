package filip.miny;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pozicia> miny = new ArrayList<Pozicia>();
        miny.add(new Pozicia(1,2));
        miny.add(new Pozicia(2,0));
        miny.add(new Pozicia(3,3));

        Scanner scanner = new Scanner(System.in);
        ParserPrikazov parser = new ParserPrikazov();
        HraMiny hra = new HraMiny(4,9, miny);
        KonzolovyZobrazovacHry zobrazovacHry = new KonzolovyZobrazovacHry();
        zobrazovacHry.zobraz(hra);

        while(hra.getStavHry() == StavHry.PREBIEHA) {
            System.out.print("> ");
            String vstup = scanner.nextLine();
            if (vstup.isBlank()) {
                continue;
            }
            IPrikaz prikaz = parser.parsuj(vstup);
            if (prikaz != null) {
                prikaz.vykonaj(hra);
                zobrazovacHry.zobraz(hra);
            } else {
                System.out.println("Zadal si nespravny prikaz");
            }
        }

        if (hra.getStavHry() == StavHry.VYHRA) {
            System.out.println("Vyhral si");
        } else if (hra.getStavHry() == StavHry.PREHRA) {
            System.out.println("Prehral si");
        } else if (hra.getStavHry() == StavHry.UKONCENA) {
            System.out.println("Ukoncil si hru");
        }



    }
}
