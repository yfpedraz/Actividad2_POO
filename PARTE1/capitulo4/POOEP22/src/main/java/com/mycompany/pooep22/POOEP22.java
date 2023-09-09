/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep22;

import java.util.Scanner;

/**
 *
 * @author YONNATTANTH
 */
public class POOEP22 {

    public static void main(String[] args) {
        
        String nombre;
        double salbash,salbasm ;
        int numhotra;
        
        System.out.println("Ingrese nombre del empleado: "); // Imprime por pantalla
        Scanner entrada1 = new Scanner(System.in);
        nombre = entrada1.nextLine();
        
        System.out.println("Ingrese el salario basico por hora: "); // Imprime por pantalla
        Scanner entrada2 = new Scanner(System.in);
        salbash = entrada2.nextDouble();
        
        System.out.println("Ingrese el numero de horas trabajadas: "); // Imprime por pantalla
        Scanner entrada3 = new Scanner(System.in);
        numhotra= entrada3.nextInt();
        
        salbasm = numhotra*salbash;
        if (salbasm > 450000) {
            
            System.out.println( nombre + " y su salario mensual es " + salbasm);
        }
        
        else {
            System.out.println(nombre);
        }
        
    }
}
