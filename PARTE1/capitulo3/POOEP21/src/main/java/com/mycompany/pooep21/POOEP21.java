/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep21;

import java.util.Scanner;

/**
 *
 * @author YONNATTANTH
 */
public class POOEP21 {

    public static void main(String[] args) {
        double lado1, lado2, lado3;
        double perimetro, semiperimetro, area;
        
        System.out.println("Ingrese el lado1 del triángulo: "); // Imprime por pantalla
        Scanner entrada1 = new Scanner(System.in);
        lado1 = entrada1.nextDouble();
        
        System.out.println("Ingrese el lado2 del triángulo: "); // Imprime por pantalla
        Scanner entrada2 = new Scanner(System.in);
        lado2 = entrada2.nextDouble();
        
        System.out.println("Ingrese el lado3 del triángulo: "); // Imprime por pantalla
        Scanner entrada3 = new Scanner(System.in);
        lado3 = entrada3.nextDouble();
        
        perimetro = lado1 + lado2 + lado3;
        semiperimetro = perimetro/2;
        area = Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
        
        System.out.println("El perimetro es " + perimetro);
        System.out.println("El semiperimetro es " + semiperimetro);
        System.out.println("El area es " + area);
    }
}
