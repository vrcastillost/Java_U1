/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class025.pkg1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Class0251 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("\n");
            System.out.println("\033[0;35mBienvenidos al Menú");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Salir");
            System.out.println("Escojar una de las opciones");
            opcion = obj.nextInt();

            switch (opcion) {
                case 1:
                    //Ingresar por teclado: La base y exponente de un número.
                    int base;
                    int exponente;
                    int resultado;
                    
                    System.out.println("Ingrese la base: ");
                    base = obj.nextInt();
                    System.out.println("Ingrese el exponente: ");
                    exponente = obj.nextInt();
                    
                    //Math.pow() retorna o eleva la base del exponente 
                    resultado = (int)Math.pow(base, exponente);
                    System.out.println(+base+" elevado a "+exponente+" es igual a "+resultado);
                    
                    break;
                case 2:
                    //Ingresar por teclado una cantidad de números: Definir el número mayor - menor.
                    int num;
                    int nmenor = 100000000;
                    int nmayor = 0;
                    int numTotal;
                    
                    System.out.println("Ingrese la cantidad de numeros : ");
                    numTotal = obj.nextInt();
                    
                    for(int i=1; i <= numTotal; i++){
                        System.out.println("Ingrese un valor : ");
                        num = obj.nextInt();
                        
                        if (num > nmayor) {
                            nmayor = num;                           
                        }
                        if (num < nmenor) {
                            nmenor = num;  
                        }
                    }
                    System.out.println("El numero mayor fue : "+nmayor);
                    System.out.println("El numero menor fue : "+nmenor);

                    break;
                case 3:
                    //Ingresar por teclado una cantidad de números: Definir la cantidad de pares, cantidad de impares y el ganador. 
                    int cantP=0;
                    int cantI=0;
                    int cantT;
                    int numX;
                    String ganador;
                    
                    System.out.println("Ingrese la cantidad de numeros : ");
                    cantT = obj.nextInt();
                    
                    for(int i=1; i <= cantT; i++){
                        System.out.println("Ingrese un numero : ");
                        numX = obj.nextInt();
                        
                        if (numX % 2 == 0) {
                            cantP++;    
                        } else {
                            cantI++;
                        }
                    }
                    ganador = (cantP > cantI)?"pares":"impares";
                    
                    System.out.println("Cantidad Pares es : "+cantP);
                    System.out.println("Cantidad Impares es : "+cantI);
                    System.out.println("El ganador es : "+ganador);
                    
                    
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo numeros del 1 al 4");
            }
        }
    }
}