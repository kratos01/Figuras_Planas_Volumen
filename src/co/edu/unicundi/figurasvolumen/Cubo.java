/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figurasvolumen;

import java.util.Scanner;

/**
 *
 * @author julian arias
 */
public class Cubo extends FigurasVolumen{
Scanner entrada = new Scanner(System.in);
    double arista;
    
    public void Area() {
    double area;
        System.out.print("digite la longitud de la ariasta:");
        arista = entrada.nextDouble();
        
        area = 6 * Math.pow(arista, 2);
        System.out.println("el area del cubo es de: " + area);
    }

    
    public void volumen() {
         double volumen;
         
         volumen = Math.pow(arista, 3);
         System.out.println("el volumen del cubo es: " + volumen);
    }
    
}
