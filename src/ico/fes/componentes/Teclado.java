/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author HP
 */
public class Teclado {
    private String marca;
    private String modelo;
    private int numTeclas;
    private boolean colorsRGB;

    public Teclado() {
    }

    public Teclado(String marca, String modelo, int numTeclas, boolean colorsRGB) {
        this.marca = marca;
        this.modelo = modelo;
        this.numTeclas = numTeclas;
        this.colorsRGB = colorsRGB;
    }

    public boolean isColorsRGB() {
        return colorsRGB;
    }

    public void setColorsRGB(boolean colorsRGB) {
        this.colorsRGB = colorsRGB;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumTeclas() {
        return numTeclas;
    }

    public void setNumTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", modelo=" + modelo + ", numTeclas=" + numTeclas + ", colorsRGB=" + colorsRGB + '}';
    }

    
    
}
