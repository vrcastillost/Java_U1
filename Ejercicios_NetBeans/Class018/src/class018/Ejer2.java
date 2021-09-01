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
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //2-. Escribir un programa que calcule el volumen de un cono según la fórmula (Ingresar por teclado) V = ((πr^2h)/3)

        Scanner obj = new Scanner(System.in);
        
        final double PI = 3.142592654;
        double h =0;
        double r=0;
        double v=0;
        
        
        System.out.println("Volumen de un cono");
        System.out.println("Introduzca la altura en cm");
        h = obj.nextDouble();
        System.out.println("Introduzca el radio en cm");
        r = obj.nextDouble();
        
        v = ((PI*r*r*h)/3.0);
        System.out.println("El volumen del cono es de : "+v+"cm^3");
    }
    
}
