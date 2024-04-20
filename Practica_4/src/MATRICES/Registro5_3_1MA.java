package MATRICES;

import java.util.Scanner;

public class Registro5_3_1MA {
    public static void main(String[] args) {
        Scanner RH =new Scanner(System.in);
        Scanner RH1 =new Scanner(System.in);
        Scanner RH2 =new Scanner(System.in);
        int num;
        int cont=1;
        int cont2=1;
        System.out.println("ingrese el numero de choferes");
        num= RH2.nextInt();
        String name[] =new String[num];
        int km[][] =new int[num][6];
        int kmxdia []=new int[num];
        int aux;
        for (int i = 0; i < num; i++) {
            System.out.println("ingrese el nombre de la  persona"+(cont++))    ;
            name[i]=RH.nextLine();
            cont2=1;
            for (int j = 0; j < 6; j++) {
                System.out.println("cuantos quilometros recorrio en el dia "+(cont2++));
                km[i][j]=RH2.nextInt();
            }

        }


        for (int i = 0; i < num; i++) {
            aux=0;
            for (int j = 0; j < 6; j++) {
                aux=aux+km[i][j];
            }
            kmxdia[i]=aux;
        }

        for (int i = 0; i < num; i++) {
            System.out.print("la persona "+(i+1)+": "+name[i]);
            System.out.println(" a rrecorrido un total de :"+kmxdia[i]+" km en la semana");

        }
    }
}
