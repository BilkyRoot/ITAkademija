package test;

public class tabela {
    public static void main(String[] args) {
        System.out.println("Vježba - Tabela");
        int visina, sirina, slika;

        for (sirina=0; sirina<20; sirina++) {
            System.out.print("#");
        }
        System.out.println();
        for (visina=2; visina<10; visina++) {
            System.out.print("#");
            for (slika=2; slika<20; slika++) {
                System.out.print("0");
            }
            System.out.println("#");
        }
        for (sirina=0; sirina<20; sirina++) {
            System.out.print("#");
        }
    }
}
