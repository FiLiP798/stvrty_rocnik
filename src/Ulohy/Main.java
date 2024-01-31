package Ulohy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int prve = 10;
        int druhe = 20;

        // System.out.printf("Prve cislo je %d, druhe je %d, sucet je %d",prve,druhe,prve+druhe);

        /*
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);

            }
        }



        for (int i = 0; i < 20; i+=2) {
            System.out.println(i);
        }

         */


        /*
        int[] cisla = new int[1000];
        for (int i = 0; i < cisla.length; i++) {
            cisla[i] = i + 1;
        }
        for (int i = cisla.length-10; i < cisla.length; i++) {
            System.out.println(cisla[i]);
        }

         */

        /*
        int[][] cisla = {
                {43, 60, 44, 65, 85, 51},
                {24, 35, 52, 62, 9, 90},
                {75, 84, 71, 36, 1, 32},
                {82, 63, 73, 66, 79, 13},
                {87, 16, 87, 86, 29, 73},
                {88, 55, 91, 15, 25, 49}
        };
        for (int riadok = 0; riadok < cisla.length; riadok++) {
            for (int stlpec = 0; stlpec < cisla[riadok].length; stlpec++) {
                System.out.print(cisla[riadok][stlpec] + " ");
            }
            System.out.println();
        }

         */

        int[] pole = {23,2,11,13,37,41,19,3,17,7,5,29,31};
        int[] pole2 = {23,11,13,37,19,3,17,2,7,5,13,41,29,31,41};

        uloha13(pole);


    }
    static void fbz(){
        for (int cislo = 1; cislo <= 100;cislo++) {
            boolean jeDelitelne = false;

            if (cislo % 3 == 0) {
                System.out.print("Fizz");
                jeDelitelne = true;
            }
            if (cislo % 5 == 0) {
                System.out.print("Buzz");
                jeDelitelne = true;
            }
            if (cislo % 7 == 0) {
                System.out.print("Foo");
                jeDelitelne = true;
            }
            if (!jeDelitelne) {
                System.out.print(cislo);
            }
            System.out.println();
        }
    }
    static void uloha1(){
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    static void uloha2(int a, int b){
        if (a < b) {
            for (int x = a; x < b; x++) {
                if (x % 2 == 0 && x % 3 == 0) {
                    System.out.println(x);
                }
            }
        } else {
            System.out.println("Zadal si nesprávny vstup");
        }
    }
    static void uloha3(int paF){
        int f = paF;
        System.out.print(f);
        if (f > 0) {
            while (f > 1) {
                if (f % 2 == 0) {
                    f = f/2;
                } else {
                    f = 3*f+1;
                }
                System.out.print(","+f);
            }
        } else {
            System.out.println("Zadal si nesprávny vstup");
        }
    }
    static void uloha4(double paA){
        double a = paA;
        double odmocnina = Math.sqrt(a);
        double tolerancia = 0.000010;

        int i = 1;
        System.out.println(i + ":" + a);

        while(Math.abs(a-odmocnina) >= tolerancia) {
            a = (a + paA/a) * 1/2;
            i++;
            System.out.println(i + ":" + a);
        }
    }
    static void uloha11(int[] paPole){
        int min = paPole[1];
        for (int j : paPole) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println(min);
    }
    static void uloha12(int[] paPole){
        int min2;
        /*
        int min = paPole[0];
        for (int j : paPole) {
            if (j < min) {
                min = j;
            }
        }
        for (int j : paPole) {
            if (j < min2 && j > min) {
                min2 = j;
            }
        }
         */
        for(int i = 0; i< paPole.length; i++ ){
            for(int j = i+1; j< paPole.length; j++){
                if(paPole[i]>paPole[j]){
                    min2 = paPole[i];
                    paPole[i] = paPole[j];
                    paPole[j] = min2;
                }
            }
        }
        System.out.println(paPole[1]);
    }
    static void uloha13(int[] paPole){
        int dlzka = 1;
        int maxDlzka = 1;
        int index = -1;
        for(int i = 1; i < paPole.length; i++) {
            if (paPole[i] >= paPole[i-1]) {
                dlzka++;
            } else {
                dlzka = 1;
            }
            if (dlzka > maxDlzka) {
                maxDlzka = dlzka;
                index = i;
            }
        }
        for (int j = index-maxDlzka+1; j <= index; j++) {
            System.out.print(paPole[j]);
            if (j < index) {
                System.out.print(",");
            }
        }
    }
    static void uloha14(int[] paPole){
        for(int i = 0; i < paPole.length; i++) {
            for(int j = i + 1; j < paPole.length; j++) {
                if (paPole[i] == paPole[j]) {
                    System.out.print(paPole[i] + " ");
                }
            }
        }
    }
    static void uloha15(int[] paPole){
        int pocetDuplikatov = 0;
        for(int i = 0; i < paPole.length; i++) {
            for(int j = i + 1; j < paPole.length; j++) {
                if (paPole[i] == paPole[j]) {
                    pocetDuplikatov++;
                    System.out.println("Duplikat číslo " + pocetDuplikatov+ " je " + paPole[i] + " na indexoch " + i + " a " + j);
                }
            }
        }
    }

    private static boolean isValid(String text) {
        ArrayList<Character> stack = new ArrayList<>();
        for (int i = 0;i < text.length(); i++) {
            char znak = text.charAt(i);
            if (znak == '(') {
                stack.add('(');
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            
            char poslednyZnak = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
        }
        return stack.isEmpty();
    }

}