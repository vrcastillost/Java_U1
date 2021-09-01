/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class018.pkg1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Class0181 {

    Scanner a = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Menú while - if
        Scanner a = new Scanner(System.in);
        Class0181 ejercicios = new Class0181();
        String opcion = "";

        while (!opcion.equalsIgnoreCase("d")) {
            System.out.println("\n");
            System.out.println("\033[0;35mBienvenidos al Menú");
            System.out.println("\n");
            System.out.println("Escoja las siguientes opciones");
            System.out.println("a. Ejecutar el ejercicio 1");
            System.out.println("b. Ejercutar el ejercio 2");
            System.out.println("c. Ejercutar el ejercio 3");
            System.out.println("d. Salir");
            System.out.println(" ");
            System.out.println("Su opción sera :");
            opcion = a.next();

            if (opcion.equalsIgnoreCase("a")) {
                ejercicios.ejercicio1();

            }
            if (opcion.equalsIgnoreCase("b")) {
                ejercicios.ejercicio2();
            }
            if (opcion.equalsIgnoreCase("c")) {
                ejercicios.ejercicio3();
            }
        }
    }

    public void ejercicio1() {

    }

    public void ejercicio2() {

    }

    public void ejercicio3() {

    }

}
