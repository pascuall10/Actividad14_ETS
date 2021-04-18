package actividad2proyectojava;

public class Actividad2ProyectoJava {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Punto punto = new Punto();
        Cono cono = new Cono();
        
        
        circulo.setRadio((float) Math.random()*6);    
        punto.setX((float) Math.random()*6);
        punto.setY((float) Math.random()*6);      
        cono.setAltura((float) Math.random()*6);
        cono.setColor("azul");
        
        cono.imprimir();
        circulo.imprimir();
        punto.imprimir();
    }
}
