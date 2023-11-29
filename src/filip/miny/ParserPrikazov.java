package filip.miny;

public class ParserPrikazov {
    public IPrikaz parsuj(String vstup) {
        String[] tokeny = vstup.split(" ");

        if (tokeny.length < 3) {
            return null;
        }

        try {
            int riadok = Integer.parseInt(tokeny[1]);
            int stlpec = Integer.parseInt(tokeny[2]);

            if (!tokeny[0].equals("odkry")) {
                return null;
            }

            return new PrikazOdkry(riadok, stlpec);

        } catch (NumberFormatException e) {
            return null;
        }
    }
}
