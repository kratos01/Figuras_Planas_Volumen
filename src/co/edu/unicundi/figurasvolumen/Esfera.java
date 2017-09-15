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
public class Esfera extends FigurasVolumen {
Scanner entrada = new Scanner(System.in);
    double radio;
    
    public void Area() {
    double area;
    
        System.out.println("digite el numero del radio: ");
        radio = entrada.nextDouble();
         area = 4*Math.PI * Math.pow(radio, 2);
         System.out.println("el area del la esfera es: " + area);
    }

    
    public void volumen() {
      double volumen;
      
      volumen = 4/3 * Math.PI * Math.pow(radio, 3);
        System.out.println("el volumen de la esfera es: " + volumen);
    }
    
}
