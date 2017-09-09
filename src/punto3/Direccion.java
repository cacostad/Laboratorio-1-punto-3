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
public class Direccion {
    
    String casa;
    String pais;
    String codigopostal;

    public Direccion(String casa, String pais, String codigopostal) {
        this.casa = casa;
        this.pais = pais;
        this.codigopostal = codigopostal;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }
    
}
