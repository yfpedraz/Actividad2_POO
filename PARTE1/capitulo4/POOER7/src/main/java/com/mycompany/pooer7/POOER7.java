/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooer7;

import java.util.Scanner;

/**
 *
 * @author YONNATTANTH
 */
public class POOER7 {

    public static void main(String[] args) {
        double a, b;
        
        System.out.println("Ingrese el valor de a: "); // Imprime por pantalla
        Scanner entrada1 = new Scanner(System.in);
        a = entrada1.nextDouble();
        
        System.out.println("Ingrese el valor de b: "); // Imprime por pantalla
        Scanner entrada2 = new Scanner(System.in);
        b = entrada2.nextDouble();
        
        if (a > b) {
        System.out.println("a es mayor que b");
        }
        
        else if (a == b) {
        System.out.println("a es igual a b");
        }
        
        else {
        System.out.println("a es menor que b");
        }
    }
}
