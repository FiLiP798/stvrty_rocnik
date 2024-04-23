package Pisomky.pisomka27_03;

public class Main {
    public static void main(String[] args) {
        Papaja papaja1 = new Papaja(200,"1AB-0");
        Papaja papaja2 = new Papaja(199,"1AB-1");
        Papaja papaja3 = new Papaja(566,"1AB-2");
        Papaja papaja4 = new Papaja(999,"1AB-3");
        Papaja papaja5 = new Papaja(99,"1AB-4");
        Papaja papaja6 = new Papaja(123,"1AB-5");


        SystemPapaje systemPapaje = new SystemPapaje();
        systemPapaje.pridajPapaju(papaja1);
        systemPapaje.pridajPapaju(papaja2);
        systemPapaje.pridajPapaju(papaja3);
        systemPapaje.pridajPapaju(papaja4);
        systemPapaje.pridajPapaju(papaja5);
        systemPapaje.pridajPapaju(papaja6);

        System.out.println(systemPapaje.getPocetOdstavenych());
        System.out.println(systemPapaje.getNajvyssiaHmotnost());
        System.out.println(systemPapaje.vyhladaj("1AB-5"));
    }
}
