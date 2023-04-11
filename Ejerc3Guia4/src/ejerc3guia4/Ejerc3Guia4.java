/*
 Crea una aplicación que a través de una función nos convierta una cantidad
de euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda
a convertir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ejerc3guia4;

import java.util.Scanner;

public class Ejerc3Guia4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros que quiere convertir");
        double euro = leer.nextDouble();
        System.out.println("Seleccione la moneda a la cual quiere cambiar");
        System.out.println("1-DOLARES");
        System.out.println("2-YENES");
        System.out.println("3-LIBRAS");
        String moneda = leer.next();

        conversion(euro, moneda);
    }

    public static void conversion(Double euro, String moneda) {
        switch (moneda) {
            case "1":
                System.out.println("Los "+ euro + " euros serian "+ euro * 1.28611+ " dolares");
                break;
            case "2":
                System.out.println("Los "+ euro + " euros serian "+ euro * 129.852 + " yenes");
                break;
            case "3":
                System.out.println("Los "+ euro + " euros serian "+ euro * 0.86 + " libras");
                break;
        }
    }
}
