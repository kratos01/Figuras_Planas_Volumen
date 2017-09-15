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
public class  Cuadrado extends FigurasPlanas {
Scanner entrada = new Scanner(System.in);
float lado1;
   
    
    public void Area(){
          
          float area;
          System.out.println("digite el valor de un lado del cuadrado: ");
          lado1 = entrada.nextFloat();
          
          
          area = lado1 * lado1;
          System.out.println("el area del cuadrado es :" + area);
}

    
    public void perimetro() {
           
           //double lado2;
           double perimetro;
           
           //System.out.println("digite el lado del cuadrado para saber su perimetro: ");
           //lado1 = entrada.nextDouble();
           
           perimetro = lado1 + lado1 + lado1 + lado1;
           System.out.println("el perimetro del cuadrado es: " + perimetro);
           
    }
}
