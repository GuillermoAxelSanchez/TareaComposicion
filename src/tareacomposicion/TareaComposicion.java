/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacomposicion;

import ico.fes.ArmarPC.Computadora;
import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author HP
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora gamer = new Computadora();
        gamer.setCpu(new CPU("Intel", "Core i9", 5000, "10th gen"));
        gamer.setMarca("Hp");
        gamer.setModelo("Elite Book");
        gamer.setMonitor(new Monitor("HP", "Curve", 25));
        gamer.setMouse(new Mouse("Eagle Warrior", "Gammer", "2400dpi"));
        gamer.setTeclado(new Teclado("Razer", "XMaxPro", 265, true));
        
        System.out.println(gamer);
        
        
        
        Computadora comp1 = new Computadora();
        CPU ryzen = new CPU();
        comp1.setModelo("semiGamer");
        comp1.setCpu(ryzen);
        comp1.getCpu().setMarca("Rizen");
        comp1.getCpu().setModeloProcesador(" Athlon 3000");
        comp1.getCpu().setVelocidadProcesador(3500);
        
        System.out.println("La pc "+comp1.getModelo()+" Tiene el procesador "+comp1.getCpu());
        
        Monitor curvo = new Monitor();
        comp1.setMonitor(curvo);
        comp1.getMonitor().setMarca("Xzeal");
        comp1.getMonitor().setPulgadas(24);
        comp1.getMonitor().setModelo("XZMX015B Curvo");
        
        System.out.println("La pc "+comp1.getModelo()+" tiene el monitor "+ comp1.getMonitor());
    }
    
}
