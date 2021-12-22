package test;

import java.util.Scanner;

public class banka {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------");
        System.out.println("\t\t\t\t\tUnicreditBank");
        System.out.println("------------------------------------------------------");
        System.out.println("Da bi ste provjerili stanje računa upišite broj 1");
        System.out.println("Da bi izvršili transakciju upišite broj 2");
        System.out.println("------------------------------------------------------");
        Scanner unos = new Scanner(System.in);
        double stanjeRacuna = 100;
        System.out.print("Upišite željenu opciju: ");
        double opcija = unos.nextDouble();
        if (opcija == 1) {
            System.out.printf("Stanje vašeg računa %.2fKM", stanjeRacuna);
            System.out.println();
            System.out.println("------------------------------------------------------");
            System.out.println("Zatvara se program...");
        } else if (opcija == 2) {
            System.out.print("Unesite iznos za transakciju: ");
            double iznos = unos.nextDouble();
            System.out.println("------------------------------------------------------");
            double novoStanjeRacuna = stanjeRacuna - iznos;
            if (novoStanjeRacuna<0) {
                System.out.println("Transkacija se ne može izvršiti, nemate dovoljno sredstava na Vašem računu");
                System.out.println("------------------------------------------------------");
                System.out.println("Zatvara se program...");
            } else {
                System.out.println("Transakcija je uspješno završena.");
                System.out.printf("Novo stanje Vašeg računa: %.2fKM", novoStanjeRacuna);
                System.out.println();
                System.out.println("------------------------------------------------------");
                System.out.println("Zatvara se program...");
            }
        } else {
            System.out.println("Nepoznata opcija");
            System.out.println("------------------------------------------------------");
            System.out.println("Zatvara se program...");
        }
    }
}