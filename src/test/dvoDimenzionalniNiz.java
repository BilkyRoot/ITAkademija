package test;

import java.util.Scanner;

public class dvoDimenzionalniNiz {
    public static void main(String[] args) {

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

        // NIZ

        int[][] niz = {
                {15, 20, 30, 50, 665},
                {33, 233, 45, 42, 232},
                {37, 46, 47, 80, 90}
        };

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
