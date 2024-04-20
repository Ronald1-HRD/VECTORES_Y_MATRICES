package VERCTORES;

import java.util.Scanner;

public class Ejemplo5_1VEC {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        int A[] =new int [4];
        for (int i = 0; i < 4; i++) {
            System.out.println("ingrese un dato");
            A[i]=RH.nextInt();

        }
        for (int i = 0; i < 4; i++) {
            System.out.println(A[i]);

        }
    }
}
