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
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1-. Escribir un programa que calcule el área de un rectángulo. (Ingresar por teclado ) A = (Base*ALtura)
        Scanner obj = new Scanner(System.in);
        
        int area;
        int base;
        int altura;
        
        System.out.println("Área de un rectágulo");
        System.out.println("Introduzca la longitud de la base en cm: ");
        base = obj.nextInt();
        System.out.println("Introuduzca la altura en cm: ");
        altura = obj.nextInt();
        
        area = base*altura;
        System.out.println("El área del rectángulo es : "+area+"cm^2");
        
        
    }
    
}
