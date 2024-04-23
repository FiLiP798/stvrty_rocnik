package Pisomky.pisomka14_2;

public abstract class Zviera implements IPohyblivy{
    private int poloha = 0;

    public int getPoloha() {
        return this.poloha;
    }

    public void setPoloha(int poloha) {
        this.poloha = poloha;
    }

    public abstract String vydajZvuk();
}
