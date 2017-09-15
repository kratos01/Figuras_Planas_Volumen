/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figurasplanasvolumen;

import java.util.Scanner;



/**
 *
 * @author julian arias
 */
public class Circulo extends FigurasPlanas {
    double radio;
   Scanner entrada = new Scanner(System.in);
   
    
    public void Area() {
      double area;
        System.out.println("digite el radio del circulo: ");
        radio = entrada.nextDouble();
        
        area = Math.PI * Math.pow(radio,2);
        System.out.println("el area del circulo es: " + area);
        
    }

   
    
    public void perimetro() {
       double perimetro;
        double radio1 = radio;
       
        perimetro = 2* Math.PI * radio1;
        System.out.println("el perimetro del circulo es: " + perimetro);
    }
    
}
