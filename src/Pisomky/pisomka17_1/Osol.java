package Pisomky.pisomka17_1;

public class Osol implements IZviera{
    private int x = 0;
    private int v = 5;

    @Override
    public void pohniSa() {
        if (this.x <= (40-this.v)) {
            this.x += this.v;
        }
    }
}
