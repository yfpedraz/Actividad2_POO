/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooer15;

import java.util.Scanner;

/**
 *
 * @author YONNATTANTH
 */
public class POOER15 {

    public static void main(String[] args) {
        
        double pesoA, pesoB, pesoC, pesoD;
        
        System.out.println("Ingrese el peso de la 1era bolita: "); // Imprime por pantalla
        Scanner entrada1 = new Scanner(System.in);
        pesoA = entrada1.nextDouble();
        
        System.out.println("Ingrese el peso de la 2da bolita: "); // Imprime por pantalla
        Scanner entrada2 = new Scanner(System.in);
        pesoB = entrada2.nextDouble();
        
        System.out.println("Ingrese el peso de la 3era bolita: "); // Imprime por pantalla
        Scanner entrada3 = new Scanner(System.in);
        pesoC = entrada3.nextDouble();
        
        System.out.println("Ingrese el peso de la 4ta bolita: "); // Imprime por pantalla
        Scanner entrada4 = new Scanner(System.in);
        pesoD = entrada4.nextDouble();
        
        if (pesoA == pesoB && pesoA == pesoC) {
            
            System.out.println("La esfera D es la diferente");
            
            if (pesoD > pesoA) {
                
            
            System.out.println("y es la de mayor peso");                

            }
            
        
            else {
                System.out.println("y es la de menor peso");
            
            }
        }
        else if (pesoA == pesoB && pesoA == pesoD) {
            System.out.println("La esfera C es la diferente");
            if (pesoC > pesoA) {
                
            
            System.out.println("y es la de mayor peso");                

            }
            
            else {
                System.out.println("y es la de menor peso");
            }
       
        
        }
       
            else if (pesoA == pesoC && pesoA ==pesoD) {
                    System.out.println("La esfera B es la diferente");
                    if (pesoB > pesoD) {
                    System.out.println("y es la de mayor peso");
                    }
                    else  {
                    System.out.println("y es la de menor peso");
                            }
            }
            else  {
                    System.out.println("La esfera A es la diferente");
                    
                    if (pesoA > pesoB) {
                    System.out.println("y es la de mayor peso");
                    }
                    else {
                    System.out.println("y es la de menor peso");
                    
                            }
                    }
        
    }
}
