/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooer11;

import java.util.Scanner;

/**
 *
 * @author YONNATTANTH
 */
public class POOER11 {

    public static void main(String[] args) {
        int N1, N2, N3;
        
        System.out.println("Ingrese el 1er numero: "); // Imprime por pantalla
        Scanner entrada1 = new Scanner(System.in);
        N1 = entrada1.nextInt();
        
        System.out.println("Ingrese el 2do numero: "); // Imprime por pantalla
        Scanner entrada2 = new Scanner(System.in);
        N2 = entrada2.nextInt();
        
        System.out.println("Ingrese el 3er numero: "); // Imprime por pantalla
        Scanner entrada3 = new Scanner(System.in);
        N3 = entrada3.nextInt();
        
        if (N1>N2 && N1<N3) {
        System.out.println("El numero mayor es " + N1);    
    }
        
        else if (N2>N3) {
        System.out.println("El numero mayor es " + N2);    
    }
        
        else {
        System.out.println("El numero mayor es " + N3);    
    }
        
        
    }
}
