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
public class Modelodelcarro {
     private Categoria categoria;
     private String numerodemodelo;
     int precio;

    public Modelodelcarro(Categoria categoria, String numerodemodelo, int precio) {
        this.categoria = categoria;
        this.numerodemodelo = numerodemodelo;
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNumerodemodelo() {
        return numerodemodelo;
    }

    public void setNumerodemodelo(String numerodemodelo) {
        this.numerodemodelo = numerodemodelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
     
     
}
