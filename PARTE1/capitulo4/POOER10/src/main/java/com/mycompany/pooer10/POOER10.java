/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooer10;

import java.util.Scanner;

/**
 *
 * @author YONNATTANTH
 */
public class POOER10 {
   
    
    

    public static void main(String[] args) {
        int numeroinscripcion; 
        double incremento;
        String nombres; 
        double patrimonio, pagomatricula;
        int estratosocial;
        double valorconstante;
        
        System.out.println("Ingrese el numero de inscripcion: "); // Imprime por pantalla
        Scanner entrada1 = new Scanner(System.in);
        numeroinscripcion = entrada1.nextInt();
        
        System.out.println("Ingrese el nombre: "); // Imprime por pantalla
        Scanner entrada2 = new Scanner(System.in);
        nombres = entrada2.nextLine();
        
        System.out.println("Ingrese el patrimonio: "); // Imprime por pantalla
        Scanner entrada3 = new Scanner(System.in);
        patrimonio = entrada3.nextDouble();
        
        System.out.println("Ingrese el estrato social: "); // Imprime por pantalla
        Scanner entrada4 = new Scanner(System.in);
        estratosocial = entrada4.nextInt();
        
        pagomatricula = 50000;
       
        if (patrimonio > 2000000 && estratosocial > 3) {
       
        pagomatricula = pagomatricula + (0.03*patrimonio);
        System.out.println("El numero de inscrpcion es " + numeroinscripcion);
        System.out.println("Nombre " + nombres);
        System.out.println("El pago de matricula es " + pagomatricula);
        
        }
        
        else {
         
        System.out.println("El numero de inscrpcion es " + numeroinscripcion);
        System.out.println("Nombre " + nombres);
        System.out.println("El pago de matricula es " + pagomatricula);
        }
       
    }
}
