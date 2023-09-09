/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooer12;

import java.util.Scanner;

/**
 *
 * @author YONNATTANTH
 */
public class POOER12 {

    public static void main(String[] args) {
        String nom;
        int nht, het, hee8;
        double salario;
        double vhn;
        
        System.out.println("Ingrese el nombre: "); // Imprime por pantalla
        Scanner entrada1 = new Scanner(System.in);
        nom = entrada1.nextLine();
        
        System.out.println("Ingrese el numero de horas trabajadas: "); // Imprime por pantalla
        Scanner entrada2 = new Scanner(System.in);
        nht = entrada2.nextInt();
        
        System.out.println("Ingrese el valor de hora normal: "); // Imprime por pantalla
        Scanner entrada3 = new Scanner(System.in);
        vhn = entrada3.nextDouble();
        
        if (nht > 40) {
            
            het = nht-40;
            
            if (het > 8) {
                hee8 = het -8;
                salario = (40*vhn)+(16*vhn)+(hee8*3*vhn);
            }
            
            else {
                salario = (40*vhn)+(het*2*vhn);
            }
        }
        else {
            salario = nht*vhn;
        }
        System.out.println("El trabajador " + nom + " devengo " + salario );
  
    }
}
