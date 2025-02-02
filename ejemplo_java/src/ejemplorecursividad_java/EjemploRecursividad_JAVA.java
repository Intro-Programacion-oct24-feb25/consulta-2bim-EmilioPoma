/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplorecursividad_java;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class EjemploRecursividad_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Introduza un numero:");
        num = entrada.nextInt();

        System.out.println("\nEl factorial de " + num + " es: " + factorial(num));
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}


    

