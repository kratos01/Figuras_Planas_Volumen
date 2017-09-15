/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.inicio;

import co.edu.unicundi.figurasplanasvolumen.Circulo;
import co.edu.unicundi.figurasplanasvolumen.Cuadrado;
import co.edu.unicundi.figurasplanasvolumen.Triangulo;
import co.edu.unicundi.figurasvolumen.Cilindro;
import co.edu.unicundi.figurasvolumen.Cono;
import co.edu.unicundi.figurasvolumen.Cubo;
import co.edu.unicundi.figurasvolumen.Esfera;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author julian arias
 */
public class FigurasPlanasVolumen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0 ;
        int op = 0;
        int opc = 0;
        boolean volver = true;
        boolean volve = true;
        
       do{
        Scanner entrada = new Scanner (System.in);
        System.out.println("1.-figuras Planas");
        System.out.println("2.-Figuras Volumen");
        System.out.print("digite la opcion que prefiera: "); 
        try{
        opcion = entrada.nextInt();
        }catch(InputMismatchException e){
            System.out.println("no digito un valor numerico entero");
           
        }finally{
            
        }
        
        switch(opcion){
             case 1:
                 
                 System.out.println("1.- Triangulo");
                 System.out.println("2.- Cuadrado");
                 System.out.println("3.- Circulo");
                 System.out.println("4.-Menu principal");
                 System.out.print("digite el numero de la figura que desea conocer su area y su perimetro: ");
                 try{
                 op = entrada.nextInt();
                 }catch(InputMismatchException e ){
                     System.out.println("debe digitar un numero que sea entero no recibe letras ");
                 }finally{
                     
                 }
                 
                 switch (op){
                     case 1:
                         
                         Triangulo t = new Triangulo();
                         try{
                          t.Area();
                          t.perimetro();
                         }catch(InputMismatchException e){
                              System.out.println("debe digitar un valor numerico");
                              System.out.println("los valores decimales los recibe con coma y no con punto");
                         }finally{
                             
                         }
                         break;
                     case 2:
                         
                         Cuadrado c = new Cuadrado();
                         try{
                         c.Area();
                         c.perimetro();
                         }catch(InputMismatchException e){
                              System.out.println("debe digitar un valor numerico");
                              System.out.println("los valores decimales los recibe con coma y no con punto");
                         }finally{
                             
                         }
                          break;
                     case 3:
                         Circulo cir = new Circulo();
                         try{
                         cir.Area();
                         cir.perimetro();
                         }catch(InputMismatchException e){
                              System.out.println("debe digitar un valor numerico");
                              System.out.println("los valores decimales los recibe con coma y no con punto");
                         }finally{
                             
                         }
                         break;
                     case 4:
                         break;
                     default:
                         System.out.println("tiene que digitar un numero entre 1 y 4 ");
                         
                 }
                break;
             case 2:
                 
                 System.out.println("1.- Cono");
                 System.out.println("2.- Cubo");
                 System.out.println("3.- Esfera");
                 System.out.println("4.- Cilindro");
                 System.out.println("5.-Menu Principal");
                 System.out.print("digite el numero de la figura que desea conocersu area y su perimetro: ");
                 try{
                 opc = entrada.nextInt();
                 }catch(InputMismatchException e ){
                     System.out.println("debe digitar un numero que sea entero no recibe letras ");
                 }finally{
                     
                 }
                 switch (opc){
                     case 1:
                         Cono con = new Cono();
                         try{
                         con.Area();
                         con.volumen();
                         }catch(InputMismatchException e){
                              System.out.println("debe digitar un valor numerico");
                              System.out.println("los valores decimales los recibe con coma y no con punto");
                         }finally{
                             
                         }
                         break;
                     case 2:
                         Cubo cu = new Cubo();
                         try{
                         cu.Area();
                         cu.volumen();
                         }catch(InputMismatchException e){
                              System.out.println("debe digitar un valor numerico");
                              System.out.println("los valores decimales los recibe con coma y no con punto");
                         }finally{
                             
                         }
                         break;
                     case 3:
                         Esfera es = new Esfera();
                         try{
                         es.Area();
                         es.volumen();
                         }catch(InputMismatchException e){
                              System.out.println("debe digitar un valor numerico");
                              System.out.println("los valores decimales los recibe con coma y no con punto");
                         }finally{
                             
                         }
                         break;
                     case 4:
                         Cilindro ci = new Cilindro();
                         try{
                         ci.Area();
                         ci.volumen();
                         }catch(InputMismatchException e){
                              System.out.println("debe digitar un valor numerico");
                              System.out.println("los valores decimales los recibe con coma y no con punto");
                         }finally{
                             
                         }
                         break;
                 }
                 break;
             default:
                 System.out.println("Error el numero tiene que ser 1 o 2 ");
                 
         }    
    }while(volver);
    
       }
}
