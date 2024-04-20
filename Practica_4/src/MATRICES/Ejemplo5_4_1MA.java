package MATRICES;

import java.util.Scanner;

public class Ejemplo5_4_1MA {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        int VE[][]=new int[5][5];
        int MA=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                VE [i][j]=RH.nextInt();

            }
            
        }
        System.out.println(" ");
        MA=VE[1][1];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (VE[i][j]>MA) {
                    MA=VE[i][j];
                    
                }

            }
            
        }
        System.out.println("El numero mayor es "+MA);

    }
}
