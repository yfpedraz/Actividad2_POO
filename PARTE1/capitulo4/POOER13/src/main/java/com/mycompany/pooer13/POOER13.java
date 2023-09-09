/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooer13;

import java.util.Scanner;

/**
 *
 * @author YONNATTANTH
 */
public class POOER13 {

    public static void main(String[] args) {
        
        double valcomp,valpag; 
        String color;
        double pdes;
        
        System.out.println("Ingrese el valor de la compra: "); // Imprime por pantalla
        Scanner entrada1 = new Scanner(System.in);
        valcomp = entrada1.nextDouble();
        
        System.out.println("Ingrese el color de la bolita: "); // Imprime por pantalla
        Scanner entrada2 = new Scanner(System.in);
        color = entrada2.nextLine();
        
        if (color == "blanco") {
            pdes = 0;
        }         
        else if (color == "verde") {
            pdes = 10;
        }
        
        else if (color == "amarillo") {
            pdes = 25;
        }
        
        else if { color == "azul")   {
                    pdes = 50;
        }
                  
        else if {
                    pdes = 100;
        }
                    
                            
                    
        
        valpag = valcomp-(pdes*valcomp/100);
        
        System.out.println("El cliente debe pagar:$" + valpag);
    }
}
