package Pisomky.pisomka14_2;

public class Macka extends Zviera{
    @Override
    public void pohniSa() {
        setPoloha(getPoloha()+10);
    }

    @Override
    public String vydajZvuk() {
        return "Meow Meow";
    }
}
