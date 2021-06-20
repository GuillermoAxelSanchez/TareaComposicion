/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.ArmarPC;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author HP
 */
public class Computadora {
    private String marca;
    private String modelo;
    private Mouse mouse;
    private Monitor monitor;
    private Teclado teclado;
    private CPU cpu;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, Mouse mouse, Monitor monitor, Teclado teclado, CPU cpu) {
        this.marca = marca;
        this.modelo = modelo;
        this.mouse = mouse;
        this.monitor = monitor;
        this.teclado = teclado;
        this.cpu = cpu;
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

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", mouse=" + mouse + ", monitor=" + monitor + ", teclado=" + teclado + ", cpu=" + cpu + '}';
    }

    
}
