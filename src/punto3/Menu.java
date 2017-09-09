/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
      
       
        Scanner i =new Scanner(System.in);
        Tienda tienda= new Tienda ("Vendedora de carros","Edificio 203"," Colombia", "1023");
         int continuar=1;
         int u=20;
         
         System.out.println("                  BIENVENIDO a la tienda almacenadora de Carros  ");
        while(continuar==1){
        System.out.println("Que desea hacer:\n");
        
        System.out.println("1.Registrar carro.");
        System.out.println("2.Ver registro.");
      System.out.println("3.Salir");
        int a=i.nextInt();
        
       
        
        i.nextLine();
        if(a<4){
            
            
        switch(a){
            case 1:{
                System.out.println("-Ingrese la categoria del carro: ");
                String categoria=i.nextLine();
                
                
                
                System.out.println("   -Ingrese el modelo: ");
                 String model=i.nextLine();
                  System.out.println("   -Ingrese el precio: ");
                 int precio=i.nextInt();
                      System.out.println("   -Ingrese la potencia: ");
                      int potencia=i.nextInt();
                      
                       i.nextLine();
                      
              tienda.getModelo(categoria,model, precio);
              
            boolean secreo=tienda.añadircarro(categoria,model,precio, potencia);
             System.out.println("\n");
            if(secreo==true){u--;System.out.println("               El carro se añadio exitosamente");
            System.out.println("              Espacio libre: "+u);
            
            }else{System.out.println("                Hubo un error");}
              
         
         
         
            
             int m=1;
             while(m==1){
        System.out.println("Si Desea continuar oprima 1 de lo contrario oprima 0:");
            int j=i.nextInt();
                i.nextLine();
            if(j>1 || j<0){
                System.out.println("Opción incorrecta");
            
            
            
            }else{
                if(j==1){m=0;}
            else{ if(j==0){m=0;continuar=0;}}
            }}
             
              break;
              }
            
            
            
            
            
            
            
           
              
                 
              
        
        case 2:{
            
           
            
            
                            
                 System.out.println("Escriba el tipo de carro que desea buscar:  ");
           String b=i.nextLine();
            tienda.verinfo(b);
            
            int o=1;
             while(o==1){
        System.out.println("La lista de productos esta arriba :C, Si Desea continuar oprima 1 de lo contrario oprima 0:");
            int s=i.nextInt();
                i.nextLine();
            if(s>1 || s<0){
                System.out.println("Opción incorrecta");
           
            }else{
                if(s==1){o=0;}
            else{ if(s==0){o=0;continuar=0;}}
            }}
            
            
            
            
            break;}
        
        
         
               
       
        
        
        
        
        
            case 3:{
                

              
                continuar=0;
                break;}
        
        }
            
            
            
            
            
            
            
            
            
    } else{
        
        System.out.println("Error\n"); continuar=0;} 
        
                
        
        
        }}}



