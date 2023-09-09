/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooer14;

import java.util.Scanner;

/**
 *
 * @author YONNATTANTH
 */
public class POOER14 {

    public static void main(String[] args) {
        
        double vd1, vd2, vd3;
        double totven, porven, salar, salar1, salar2, salar3;
        
        System.out.println("Ingrese las ventas del departamento 1: "); // Imprime por pantalla
        Scanner entrada1 = new Scanner(System.in);
        vd1 = entrada1.nextDouble();
        
        System.out.println("Ingrese las ventas del departamento 2: "); // Imprime por pantalla
        Scanner entrada2 = new Scanner(System.in);
        vd2 = entrada2.nextDouble();
        
        System.out.println("Ingrese las ventas del departamento 3: "); // Imprime por pantalla
        Scanner entrada3 = new Scanner(System.in);
        vd3 = entrada3.nextDouble();
        
        System.out.println("Ingrese el salario de los vendedores: "); // Imprime por pantalla
        Scanner entrada4 = new Scanner(System.in);
        salar = entrada4.nextDouble();
        
        totven = vd1 + vd2 + vd3;
        porven = 0.33* totven;
        
        if (vd1 > porven) {
            salar1 = salar + (0.2*salar);
        }
        
        else {
            salar1 = salar;
            
        }
        
              if (vd2 > porven) {
            salar2 = salar + (0.2*salar);
        }
        
              else {
            salar2 = salar; 
        }          
          
                      if (vd3 > porven) {
            salar3 = salar + (0.2*salar);
        }
        
        else {
            salar3 = salar;
                      }            
        System.out.println("Salario vendedores DPTO 1 " + salar1 
                + "Salario vendedores DPTO 2 " + salar2
        + "Salario vendedores DPTO 3" + salar3);
    }
}
