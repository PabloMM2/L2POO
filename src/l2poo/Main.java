package l2poo;

import java.util.Scanner;

/**
 *
 * @author Pablo Maldonado Manzano
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("----- Calculator. -----");               
        int opcion = 1, numero;
        MyCalculator calculator = new MyCalculator();          
        do {
            
            try{
                
                System.out.println();
                System.out.println("-------------------------");
                System.out.println("Selecciona una opción.");
                System.out.println("Opción 1: Calcular suma de divisores.");
                System.out.println("Opción 0: Salir.");
                Scanner opciones = new Scanner(System.in);
                opcion = opciones.nextInt();
                               
                switch(opcion){
                    case 1:

                        try {

                            System.out.println();
                            System.out.println("Ingresa un número mayor a 0 y menor a 1000");
                            Scanner teclado = new Scanner(System.in);
                            numero = teclado.nextInt();
                            if(numero > 0 && numero <= 1000){
                                calculator.divisorSum(numero);
                            }else{
                                System.out.println("El número ingresado tiene que ser mayor a 0 y mneor a 100.");
                            }

                        } catch(Exception e) {
                            System.out.println("Error: Se tiene que ingresar un número entero.");                    
                        }                   

                        break;
                    case 0:
                        System.out.println();
                        System.out.println("Adios.");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
                
                
            }catch(Exception e){
                System.out.println("Error: La opción es inválida.");                          
            }            
                
        } while(opcion != 0);
                
    }
    
}
