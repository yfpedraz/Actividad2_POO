/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep24;

import java.util.Scanner;

/**
 *
 * @author YONNATTANTH
 */
public class POOEP24 {

    public static void main(String[] args) {
        int N1, N2, N3;
        
        System.out.println("Ingrese el peso de la bola 1: "); // Imprime por pantalla
        Scanner entrada1 = new Scanner(System.in);
        N1 = entrada1.nextInt();
        
        System.out.println("Ingrese el peso de la bola 2: "); // Imprime por pantalla
        Scanner entrada2 = new Scanner(System.in);
        N2 = entrada2.nextInt();
        
        System.out.println("Ingrese el peso de la bola 3: "); // Imprime por pantalla
        Scanner entrada3 = new Scanner(System.in);
        N3 = entrada3.nextInt();
        
        if (N1>N2 && N1<N3) {
        System.out.println("La bola de mayor peso es " + N1);    
    }
        
        else if (N2>N3) {
        System.out.println("La bola de mayor peso es " + N2);    
    }
        
        else {
        System.out.println("La bola de mayor peso es " + N3);    
    }
        
        
    }
}
