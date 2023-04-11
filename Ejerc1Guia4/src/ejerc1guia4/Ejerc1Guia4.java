/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y 
deben devolver sus resultados para imprimirlos en el main. 
 */
package ejerc1guia4;

import java.util.Scanner;


public class Ejerc1Guia4 {

   
    public static void main(String[] args) {
        int opcion = 0, n1, n2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        n1 = leer.nextInt();
        System.out.println("Ingrese el segundo valor");
        n2 = leer.nextInt();
        while(opcion != 5){
        System.out.println("Elija una opcion");
        System.out.println("1.Sumar"); 
        System.out.println("2- Restar");
        System.out.println("3 - Multiplicar");       
        System.out.println("4 - Dividir");        
        System.out.println("5 - Salir");        
        opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                suma(n1,n2);
                
                break;
            case 2:
                resta(n1,n2);
                break;
            case 3:
                multiplicar(n1,n2);
                break;
            case 4:
                dividir(n1,n2);
                break;
            case 5:
                System.out.println("Adios");
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
    }
    public static void suma(int n1, int n2){
      int suma;
        suma = n1 + n2;
        System.out.println("El total de la suma es: " + suma);  
      
    }
    public static void resta(int n1, int n2){
        int resta;
        resta = n1 - n2;
        System.out.println("El total de la resta es: " + resta);
}
    public static void multiplicar(int n1, int n2){
        int multiplicar;
        multiplicar = n1 * n2;
        System.out.println("El total de la multiplicacion es: " + multiplicar);
}
    public static void dividir(int n1, int n2){
        int dividir;
        dividir = n1 / n2;
        System.out.println("El total de la division es: " + dividir);
}
}