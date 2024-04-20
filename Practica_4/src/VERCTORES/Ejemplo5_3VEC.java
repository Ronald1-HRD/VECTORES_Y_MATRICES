package VERCTORES;

import java.util.Scanner;

public class Ejemplo5_3VEC {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        int N ;
        N= RH.nextInt();
        float A[]=new float[N];
        float B[]=new float[N];
        float C[]=new float[N];


        for (int i = 0; i <N ; i++) {
            System.out.println("Ingrese el primer dato :");
            A[i]= RH.nextFloat();
            System.out.println("Ingrese el segundo dato");
            B[i]= RH.nextFloat();
        }
        for (int i = 0; i <N; i++) {
            C[i]=A[i]+B[i];
        }
        for (int i = 0; i <N; i++) {
            System.out.print(C[i]+"-------- ");
        }

    }
}
