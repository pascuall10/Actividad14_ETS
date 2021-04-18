package actividad2proyectojava;

public class Circulo {

    private float radio;
    
    public Circulo(){};

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

   

    public void imprimir() {
        System.out.print("r=" + radio);
    }
}
