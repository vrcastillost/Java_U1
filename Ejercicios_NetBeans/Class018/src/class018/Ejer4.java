/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class018;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //4-. Escribir un programa que calcule 3 notas de un alumno e ingrese por teclado.
        Scanner obj = new Scanner(System.in);
        int x;
        int y;
        int z;
        int prom=0;
        
        System.out.println("Ingrese nota n°1 :");
        x = obj.nextInt();
        System.out.println("Ingrese nota n°2 :");
        y = obj.nextInt();
        System.out.println("Ingrese nota n°3 :");
        z = obj.nextInt();
        
        prom = ((x+y+z)/3);
        
        System.out.println("Nota n°1 es :"+x);
        System.out.println("Nota n°2 es :"+y);
        System.out.println("Nota n°3 es :"+z);
        System.out.println("El promedio es :"+prom); 
    }

}
