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
        HraMiny hra = new HraMiny(4,9, miny);
        KonzolovyZobrazovacHry zobrazovacHry = new KonzolovyZobrazovacHry();

        while(hra.getStavHry() == StavHry.PREBIEHA) {
            String vstup = scanner.nextLine();

            PrikazOdkry prikaz = new PrikazOdkry(0,0);
            prikaz.vykonaj(hra);
            zobrazovacHry.zobraz(hra);
        }



    }
}
