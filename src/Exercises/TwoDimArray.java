package Exercises;

import java.util.Random;
import java.util.Scanner;

public class TwoDimArray {
    public static void main(String[] args) {

        // NIZ NAPRAVLJEN POMOĆU RANDOM GENERATORA

        Random generator = new Random();

        int[][] niz = new int[3][5];

        for (int i = 0; i< niz.length; i++){
            int[] kolona = niz[i];
            for (int j=0; j< kolona.length; j++){
                kolona[j] = generator.nextInt(300);
            }
        }

        // UVODNA PORUKA

        for (int i=0; i<50; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("\tPogodite broj i ostvarite velike nagrade");
        for (int i=0; i<50; i++) {
            System.out.print("-");
        }
        System.out.println();

        // POČETAK IGRICE I INPUT

        System.out.print("Unesite vaš broj: ");
        Scanner input = new Scanner(System.in);
        int unos = input.nextInt();
        for (int i=0; i<50; i++) {
            System.out.print("-");
        }
        System.out.println();

        // POČETNA BOOLEAN VRIJEDNOST

        boolean uslov = false;

        // PROVJERA POKLAPANJA BROJA IZ NIZA

        PROVJERA: for (int i=0; i< niz.length; i++) {
            int[] provjera = niz[i];
            for (int j = 0; j< provjera.length; j++) {
                int provjeraBroja = provjera[j];
                if (unos==provjeraBroja) {
                    uslov = true;
                    break PROVJERA;
                }
            }
        }

        // IZLAZNA PORUKA

        String poruka = uslov?"Čestitamo, osvojili ste nagradu!":"Žao nam je, pokušajte ponovo!";
        System.out.println(poruka);

    }
}