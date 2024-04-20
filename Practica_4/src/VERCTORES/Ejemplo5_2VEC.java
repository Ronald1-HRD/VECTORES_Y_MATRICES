package VERCTORES;

import java.util.Scanner;

public class Ejemplo5_2VEC {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        float VA[]=new float[10];
        float SU=0;
        for (int i = 0; i <10 ; i++) {
            System.out.println("Ingrese un dato :");
            VA[i]= RH.nextFloat();
        }
        for (int i = 0; i < 10; i++) {
            SU= (float) (SU+VA[i]);
        }
        System.out.println(" la suma de mis datos es :"+SU);
    }
}
