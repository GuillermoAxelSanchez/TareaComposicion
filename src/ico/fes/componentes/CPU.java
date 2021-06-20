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
public class CPU {
    private String marca;
    private String modelo;
    private int velocidadProcesador;
    private String modeloProcesador;

    public CPU() {
    }

    public CPU(String marca, String modelo, int velocidadProcesador, String modeloProcesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadProcesador = velocidadProcesador;
        this.modeloProcesador = modeloProcesador;
    }

    public String getModeloProcesador() {
        return modeloProcesador;
    }

    public void setModeloProcesador(String modeloProcesador) {
        this.modeloProcesador = modeloProcesador;
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

    public int getVelocidadProcesador() {
        return velocidadProcesador;
    }

    public void setVelocidadProcesador(int velocidadProcesador) {
        this.velocidadProcesador = velocidadProcesador;
    }

    @Override
    public String toString() {
        return "CPU{" + "marca=" + marca + ", modelo=" + modelo + ", velocidadProcesador=" + velocidadProcesador + ", modeloProcesador=" + modeloProcesador + '}';
    }
    
}
