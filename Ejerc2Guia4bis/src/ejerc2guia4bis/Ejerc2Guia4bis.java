/* Diseñe una función que pida el nombre y la edad de N personas e imprima 
los datos de las personas ingresadas por teclado e indique si son mayores o 
menores de edad. Después de cada persona, el programa debe preguntarle al usuario 
si quiere seguir mostrando personas y frenar cuando el usuario ingrese la 
palabra “No”.
 */
package ejerc2guia4bis;

import java.util.Scanner;

public class Ejerc2Guia4bis {

    public static void main(String[] args) {
          mayores();
    }
    public static void mayores(){
        String op;
       Scanner leer=new Scanner(System.in);
       do{
           System.out.println("Ingrese nombre");
           String nombre=leer.next();
           System.out.println("Ingrese edad");
           int edad=leer.nextInt();
           if(edad>=18){
               System.out.println("Es mayor");
           }else{
               System.out.println("Es menor");
           }
           System.out.println("Quiere seguir ingresando datos? SI/NO");
           op= leer.next();
         
       }while(!op.equalsIgnoreCase("NO"));
        }
    
}
   
    
