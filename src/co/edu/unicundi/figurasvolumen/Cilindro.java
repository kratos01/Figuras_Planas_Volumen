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
public class Cilindro extends FigurasVolumen{
Scanner entrada = new Scanner(System.in);
  double radio;
  double altura;
  
    public void Area() {
     double area;
        System.out.println("digite el valor del radio del cilindro: ");
        radio = entrada.nextDouble();
        System.out.println("digite el valor de la altura del cilindro: ");
        altura = entrada.nextDouble();
        
        area = 2 * Math.PI * radio * (radio +altura);
        System.out.println("el area del cilindro es: " + area);
    }

    
    public void volumen() {
    double volumen;
    
    volumen = Math.PI * Math.pow(radio, 2) * altura;
        System.out.println("el volumen del cilindro es: " + volumen);
    }
    
}
