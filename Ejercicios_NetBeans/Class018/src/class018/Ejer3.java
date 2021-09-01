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
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //3-. Escribir un programa que sume, reste, multiplique y divida dos números introducidos por teclado.
        Scanner obj = new Scanner(System.in);
        int x;
        int y;
        int suma;
        int resta;
        int multiplicacion;
        double division;
        
        System.out.println("Introduzca el primer número: ");
        x = obj.nextInt();
        System.out.println("Introduzca el segundo número: ");
        y = obj.nextInt();
        
        suma = x+y;
        resta = x-y;
        multiplicacion = x*y;
        division = (double) x/y;
        
        System.out.println("x + y = "+(suma));
        System.out.println("x - y = "+(resta));
        System.out.println("x * y = "+(multiplicacion));
        System.out.println("x / y = "+(division));
        
        
    }
    
}
