/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc1guia4bis;

import java.util.Scanner;


public class Ejerc1Guia4bis {

  
    public static void main(String[] args) {
        int nuM1, nuM2, op, rSuma, rResta,rMulti;
        Scanner leerN = new Scanner(System.in);
        System.out.println("Ingrese los dos numeros: ");
        nuM1 = leerN.nextInt();
        nuM2 = leerN.nextInt();
        
        rSuma = suma(nuM1,nuM2);
        rResta = resta(nuM1,nuM2);
        rMulti = multi(nuM1,nuM2);
        double rDiv= div(nuM1,nuM2);

        do {
            System.out.println("Opcion 1: Sumar");
            System.out.println("Opcion 2: Restar");
            System.out.println("Opcion 3: Multiplicar");
            System.out.println("Opcion 4: Dividir");
            System.out.println("Opcion 5: Salir");
            System.out.println(" ");
            System.out.println("Que desea hacer?");
            op = leerN.nextInt();

            switch (op) {
                case 1:
                    System.out.println("la suma es: " + rSuma);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("la resta es: " + rResta);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("la multiplicacion es: " + rMulti);
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("la division es: "+rDiv);
                    System.out.println(" ");
                    break;
            }
        } while (op != 5 || op < 5);

    }

    public static  int suma(int nuM1, int nuM2){
    int s= nuM1+nuM2;
        
        return s;
    }
    public static int resta(int nuM1, int nuM2){
    int r = nuM1-nuM2;
       return r;
    }
    
    public static int multi(int nuM1, int nuM2){
    int m=nuM1*nuM2;
        return m;
    }
    public static double div(int nuM1, int nuM2){
    double d= nuM1/nuM2;
        return d;
    }
}