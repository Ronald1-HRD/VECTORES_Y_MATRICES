package MATRICES;

import java.util.Scanner;
public class Ejemplo5_2_1MA {
        public static void main(String[] args) {
            Scanner RH =new Scanner(System.in);
            int valor [][]=new int[4][4];
            int NC=0;

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.println("fila "+i+"  columna "+j);
                    valor[i][j]=RH.nextInt();

                }
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (valor[i][j]==0) {
                        NC=NC+1;
                    }
                }

            }
            System.out.println("el numero 0 aparece : "+NC+" veces");
        }
}