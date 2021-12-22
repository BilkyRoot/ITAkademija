package BankSystem.BalanceAndCharge;

import java.util.Scanner;

public class Card {
    private String terminalAppearance;
    private final double startBalance = 150;
    private String balance;
    private String charge;

    // DESIGN FOR TERMINAL

    public void setTerminalAppearance() {
        for (int i=0; i<54; i++) {
            System.out.print("-");
        }
        System.out.println();

        this.terminalAppearance = terminalAppearance;
    }

    // CARD BALANCE

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        setTerminalAppearance();
        System.out.printf("Vaše stanje računa je: %.2fKM", startBalance);
        System.out.println();
        setTerminalAppearance();
        System.out.println("Program se zatvara...");

        this.balance = balance;
    }

    // CARD CHARGE

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
       setTerminalAppearance();
       System.out.print("Unesite iznos za transakciju: ");
       Scanner transactionValue = new Scanner(System.in);
       double value2 = transactionValue.nextDouble();
       setTerminalAppearance();
            if ((value2>=1) && (value2<=startBalance)) {
                double newCardBalance = startBalance - value2;
                System.out.println("Transakcija je uspješno završena!");
                System.out.printf("Novo stanje Vašeg računa: %.2fKM", newCardBalance);
                System.out.println();
            } else {
                System.out.println("Transkacija se ne može izvršiti, nemate dovoljno sredstava na Vašem računu!");
            }
            setTerminalAppearance();
            System.out.println("Program se zatvara...");

        this.charge = charge;
    }

}