/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

/**
 *
 * @author CRIS
 */
public class Tienda {
    public String nombre;
        private Direccion direccion;
        private Carro[] carro;
        private int numerodecarros;

private Modelodelcarro modelo;
private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public Modelodelcarro getModelo(String categoria,String model ,int precio) {
        return modelo;
    }






    public Tienda(String nombre,String casa, String pais, String codigopostal) {
        this.nombre=nombre;
       
       
        this.carro = new Carro[19];
        this.numerodecarros=0;
    }

    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carro[] getCarro() {
        return carro;
    }

    public void setCarro(Carro[] carro) {
        this.carro = carro;
    }

    public int getNumerodecarros() {
        return numerodecarros;
    }

    public void setNumerodecarros(int numerodecarros) {
        this.numerodecarros = numerodecarros;
    }

 

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
        
       public boolean añadircarro(String categoria, String model, int precio , int potencia ){
       
   Carro car = new Carro(categoria,  model,  precio ,potencia);
   
   if (this.numerodecarros<19){
   this.carro[this.numerodecarros
           ]=car;
   
   this.numerodecarros++;
   return true;
   }
   else{return false;}
   
      
       }
        
       public void verinfo(String a){
           
           for(int i=0;i<this.numerodecarros;i++){
               
               if(this.carro[i].categoria.equals(a)){
                   
                   
               System.out.println("La categoria del carro es:"+this.carro[i].getCategoria()+"\n"+"    -Modelo:"+this.carro[i].getModel()+"\n"+"    -Potencia:"+this.carro[i].getPotencia()+"km/h"+"\n"+"    -Precio:"+this.carro[i].getPrecio()+"$\n");
               }
       
       }
           
           
       
       }
       
}
