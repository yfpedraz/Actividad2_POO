/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep23;

import java.util.Scanner;

/**
 *
 * @author YONNATTANTH
 */
public class POOEP23 {

    public static void main(String[] args) {
        double a, b, c,disc, sol1, sol2;
        
        System.out.println("Ingrese el valor de a: "); // Imprime por pantalla
        Scanner entrada1 = new Scanner(System.in);
        a = entrada1.nextDouble();
        
        System.out.println("Ingrese el valor de b: "); // Imprime por pantalla
        Scanner entrada2 = new Scanner(System.in);
        b = entrada2.nextDouble();
        
        System.out.println("Ingrese el valor de c: "); // Imprime por pantalla
        Scanner entrada3 = new Scanner(System.in);
        c = entrada3.nextDouble();
        
        disc = (Math.pow(b, 2)-(4*a*c));
        sol1 = (-b+Math.sqrt(disc))/2*a;
        sol2 = (-b-Math.sqrt(disc))/2*a;
        if (disc > 0) {
            System.out.println("Tiene dos soluciones reales y son " + sol1 + " y " + sol2);
        }
        
        else if (disc == 0) {
            System.out.println("Tiene una solucion real y es " + sol1);
        }
        
        else {
            System.out.println("No tiene soluciones reales");
        }
       
    }
}
