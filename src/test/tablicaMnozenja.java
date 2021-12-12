package test;

public class tablicaMnozenja {
    public static void main(String[] args) {
        System.out.println("Vježba - Tablica množenja");
        for (int okvir = 0; okvir < 25; okvir++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("#\t\t1\t\t2\t\t3");
        for (int okvir = 0; okvir < 25; okvir++) {
            System.out.print("*");
        }
        System.out.println();
        int[] tabela = {1, 2, 3};
        int[] redoslijed = {0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int prvaTabela=0; prvaTabela<tabela[0]; prvaTabela++) {
            for (int drugaTabela=1; drugaTabela<tabela[1]; drugaTabela++){
                for (int trecaTabela=2; trecaTabela<tabela[2]; trecaTabela++){
                    for (int i=1; i<redoslijed.length; i++) {
                        int rezultat0 = tabela[prvaTabela] * redoslijed[i];
                        int rezultat1 = tabela[drugaTabela] * redoslijed[i];
                        int rezultat2 = tabela[trecaTabela] * redoslijed[i];
                        System.out.println(i + "\t\t" + rezultat0 + "\t\t" + rezultat1 + "\t\t" + rezultat2);
                    }
                }
            }
        }

    }
}