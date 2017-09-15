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
public class Triangulo extends FigurasPlanas{

    
public void  Area(){
    double area;
    double base;
    double altura; 
    
    Scanner entrada = new Scanner (System.in);
    
    System.out.println("digite el numero de la base: ");
     base = entrada.nextDouble();
     System.out.println("digite el numero de la altura: ");
     altura = entrada.nextDouble();
     
    area = (base * altura)/2;
    
    System.out.println("el area del tringulo es: " + area);
        
    
}

    public void perimetro() {
        
        double lado1;
        double lado2;
        double lado3;
        
       Scanner entrada= new Scanner(System.in);
       
        System.out.println("digite el lado 1 del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("digite el lado 2 del triangulo: ");
        lado2= entrada.nextDouble();
        System.out.println("digite el lado 3 del triangulo: ");
        lado3 = entrada.nextDouble();
        
        double perimetro = lado1 +lado2 + lado3;
        
        System.out.println("el perimetro del triangulo es: " + perimetro);
        
        
    }
    
}
