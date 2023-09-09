/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep18;

import java.util.Scanner;

/**
 *
 * @author YONNATTANTH
 */
public class POOEP18 {

    public static void main(String[] args) {
        double salariobruto, salarioneto, valorretencion, retencion;
        int codigoempleado;
        String nombres;
        int horastrabajadasmes;
        double valorhoratrabajada; 
        double pretencionfuente;
        
        System.out.println("Ingrese el codigo del empleado: "); // Imprime por pantalla
        Scanner entrada = new Scanner(System.in);
        codigoempleado = entrada.nextInt();
        
        System.out.println("Ingrese el nombre del empleado: "); // Imprime por pantalla
        Scanner entrada2 = new Scanner(System.in);
        nombres = entrada2.nextLine();
        
        System.out.println("Ingrese las horas trabajadas al mes: "); // Imprime por pantalla
        Scanner entrada3 = new Scanner(System.in);
        horastrabajadasmes = entrada3.nextInt();
        
        System.out.println("Ingrese el valor de la hora: "); // Imprime por pantalla
        Scanner entrada4 = new Scanner(System.in);
        valorhoratrabajada = entrada4.nextDouble();
        
        System.out.println("Ingrese porcentaje de la retencion: "); // Imprime por pantalla
        Scanner entrada5 = new Scanner(System.in);
        retencion = entrada5.nextDouble();
        
        pretencionfuente = retencion/100;
        
        salariobruto =horastrabajadasmes * valorhoratrabajada;
        valorretencion = salariobruto * pretencionfuente;
        salarioneto = salariobruto - valorretencion;
        
        
        System.out.println("codigo" + codigoempleado);
        System.out.println("nombres" + nombres);
        System.out.println("salario bruto es " + salariobruto);
        System.out.format("%f%n", salariobruto);
        System.out.println("salario neto es " + salarioneto);
        
    }
}
