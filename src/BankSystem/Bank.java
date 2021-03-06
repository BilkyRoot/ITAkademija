package BankSystem;

import BankSystem.BalanceAndCharge.Card;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        // BASIC IMPORT

        Scanner value = new Scanner(System.in);

        // VARIABLES

        Card design = new Card();
        Card balance = new Card();
        Card charge = new Card();

        // BEGINNING OF THE PROGRAM

        design.setTerminalAppearance();
        System.out.println("\t\t\t\t\tBankovni Sistem");
        design.setTerminalAppearance();
        System.out.println("Da bi ste provjerili stanje računa upišite broj 1");
        System.out.println("Da bi izvršili transakciju upišite broj 2");
        design.setTerminalAppearance();
        System.out.print("Unesite Vašu željenu opciju: ");
        int optionValue = value.nextInt();
        if (optionValue==1) {
            balance.setBalance(balance.getBalance());
        } else if (optionValue==2) {
            charge.setCharge(charge.getCharge());
        } else {
            design.setTerminalAppearance();
            System.out.println("Nepoznata opcija!");
            design.setTerminalAppearance();
            System.out.println("Program se zatvara...");
        }

       // END OF PROGRAM

    }
}