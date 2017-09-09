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
public class Carro {
    private Modelodelcarro modelo;
    int potencia;
    String categoria;
    String model;
int precio;

    public Carro(String categoria, String model, int precio,int potencia) {
        this.potencia = potencia;
        this.categoria = categoria;
        this.model = model;
        this.precio = precio;
    }

    
    public String getCategoria() {
        return categoria;
    }

    public String getModel() {
        return model;
    }

    public int getPrecio() {
        return precio;
    }

    public Modelodelcarro getModelo() {
        return modelo;
    }

    public void setModelo(Modelodelcarro modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
}
