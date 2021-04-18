/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1proyectojava;

/**
 *
 * @author Theki
 */
public class Actividad1ProyectoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo circulo = new Circulo();
        Punto punto = new Punto();
        Cono cono = new Cono();
        
        
        circulo.setRadio((float) Math.random()*6);    
        punto.setCentroX((float) Math.random()*6);
        punto.setCentroY((float) Math.random()*6);      
        cono.setAltura((float) Math.random()*6);
        cono.setColor("azul");
        
        cono.imprimir();
        
   
        
        
        
        
    }
    
}
