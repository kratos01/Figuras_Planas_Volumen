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
public class Cono extends FigurasVolumen {
Scanner entrada = new Scanner(System.in);
double radio;
double altura;
    
   
    public void Area() {
        double area;
        double geratriz;
        System.out.println("digite el radio del cono: ");
        radio = entrada.nextDouble();
        System.out.println("digite la altura del cono: ");
        altura = entrada.nextDouble();
        
        geratriz = Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2));
        area = Math.PI * radio * (radio + geratriz);
        System.out.println("el area del cono es: " + area);
    }

    
    public void volumen() {
        double volumen;
        double radiov = radio;
        double alturav = altura;
        
        volumen = (Math.PI * Math.pow(radiov, 2) * alturav) / 3;
        System.out.println("el volumen del cono es: " + volumen);
    }
    
    
}
