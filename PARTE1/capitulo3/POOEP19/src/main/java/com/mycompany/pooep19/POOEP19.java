/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep19;

import java.util.Scanner;

/**
 *
 * @author YONNATTANTH
 */
public class POOEP19 {

    public static void main(String[] args) {
        double lado, perimetro, altura, area;
        
        System.out.println("Ingrese el lado del triángulo: "); // Imprime por pantalla
        Scanner entrada = new Scanner(System.in);
        lado = entrada.nextDouble();
        
        perimetro = 3*lado;
        altura = (lado)*Math.sqrt(3)/2;
        area = ((Math.pow(lado, 2)*Math.sqrt(3))/4);
        
        System.out.println("El perimetro es " + perimetro);
        System.out.println("La altura es " + altura);
        System.out.println("El area es " + area);
    }
}
