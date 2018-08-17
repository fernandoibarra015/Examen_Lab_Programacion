/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_lab_programacion;
import java.util.Scanner;
/**
 *
 * @author ferna
 */
public class Examen_Lab_Programacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("~~~ E X A M E N  P R O G R A M A C I O N   I ~~~");
        String palabra=" ", palabra2;
        int opcionmenu=0, cantidadString=0, opcionlavanderia=0, contador=0;
        do{
        System.out.println("\n~~~ Menu Principal ~~~");
        System.out.println("1. La String Mayor");
        System.out.println("2. La Lavanderia");
        System.out.println("3. Palabra Palindroma");
        System.out.println("4. Salir del Sistema");
        System.out.print("Ingrese una opcion del menu: ");
            opcionmenu=leer.nextInt();
       
        
        switch(opcionmenu){
            case 1:
                System.out.println("\n~~ La String Mayor ~~");
                System.out.print("Cuantas palabras desea ingresar: ");
                cantidadString= leer.nextInt();
                System.out.println("Ingrese las palabras: ");
                while(contador <= cantidadString){
                    
                    palabra2 = leer.nextLine();
                    if (palabra2.length() > palabra.length()){
                        palabra = palabra2;
                    }else {palabra = palabra;}
                    contador ++;
                }
                System.out.println("La palabra de mayor extension es: " + palabra);
                break;
                
            case 2:
                
                
                  int opcionLavanderia,tipoLavado,prendaformal,prendacasual,colchas,dryclean=50,Prendaextra,suavizante,contadorCasual=0,contadorFormal=0,contadorColchas=0,
                          Formal=0,Casual=0,Colchas=0,Suavizante=0;
                  double impuesto,total,subtotal;
                  System.out.println("\n~~~ La Lavanderia ~~~");
                  System.out.print("Ingrese nombre del cliente : ");
                  String nombrecliente = leer.next();
                  
                  do {
                      System.out.println("~~ Menu de Lavados ~~");
                      System.out.println("1. Prenda Formal");
                      System.out.println("2. Prenda Casual");
                      System.out.println("3. Colcha ");
                      System.out.print("\nIngrese el tipo de prenda: ");
                      opcionLavanderia = leer.nextInt();
                      System.out.println("\n1. Normal");  
                      System.out.println("2. DryClean");
                      System.out.print("Ingrese tipo de lavado: ");
                      tipoLavado = leer.nextInt();
                      
                      switch (opcionLavanderia)
                      {
                          case 1 :
                              contadorFormal++;
                              if (tipoLavado ==2)
                              {
                              prendaformal = 50 + dryclean;
                              
                              }
                              else{
                              prendaformal= 50;
                              }
                            Formal=Formal + prendaformal;                          
                              break;
                              
                              
                          case 2:
                              contadorCasual++;
                              if (tipoLavado ==2)
                              {
                              prendacasual = 20 + dryclean;
                              }
                              else{
                              prendacasual= 20;
                              }
                            Casual=Casual + prendacasual;                     
                              break;
                              
                              
                          case 3: 
                              contadorColchas++;
                              if (tipoLavado ==2)
                              {
                              colchas = 100 + dryclean;
                              }
                              else{
                              colchas= 100;
                              }
                            Colchas=Colchas + colchas;                         
                              break;
                          default:
                              break;  
                      }         
                            System.out.println("\n1. Si \n2. No");
                            System.out.print("\n Quiere lavar otra prenda? :");
                            Prendaextra = leer.nextInt();
                  }while(Prendaextra != 2 );
                   
                      
                      System.out.println("\n1. Si Lps. 200 Extra");
                      System.out.println("2. No");
                      System.out.print("Quiere agregar suavizante? : ");
                      suavizante = leer.nextInt();
                      if(suavizante == 1)
                      {
                      Suavizante = 200;
                      }
                      else if(suavizante == 2)
                      {
                       Suavizante = 0;  
                      }
                      
                      System.out.println("~~~ Facturacion ~~~");
                      System.out.println("Factura del cliente: " + nombrecliente);
                      System.out.println("Prendas Formales : " + contadorFormal);
                      System.out.println("Prendas Casuales : " + contadorCasual);
                      System.out.println("Prendas Colchas : " + contadorColchas);
                      subtotal = Formal + Casual + Colchas + Suavizante;
                      System.out.println("Subtotal es de: " + subtotal);
                      impuesto = subtotal * 0.15;
                      System.out.println("El impuesto es de: " + impuesto);
                      total = subtotal + impuesto;
                      System.out.println("Total a pagar es de: " + total);
                break;
                
                
                
            case 3:
                System.out.println("\n~~ Palabra Palindroma ~~");
                String palabraIngresada, palabraIngresada2 = ""; 
                System.out.print("Ingrese una palabra: "); 
                palabraIngresada = leer.next(); 
                for (int i = palabraIngresada.length() - 1; i >= 0; i--) { 
                palabraIngresada2 = palabraIngresada2 + palabraIngresada.charAt(i); 
                } 
                if (palabraIngresada.equals(palabraIngresada2)) { 
                System.out.println("La palabra \"Si\" es palindroma");  
                }else{
                System.out.println("La palabra \"No\" es palindroma");
                } break;
        }
        
    }while(opcionmenu!=4);    
    }
    
}
