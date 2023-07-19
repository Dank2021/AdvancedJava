package javaA.com.comparator;

public class Persona {

    private String trabajo;
    private String nombre;
    private int edad;

    public Persona(String trabajo, String nombre, int edad) {
        this.trabajo = trabajo;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTrabajo() {return trabajo;}

    public void setTrabajo(String trabajo) { this.trabajo = trabajo; }

    public int getEdad() { return edad; }

    public void setEdad(int edad) {this.edad = edad;}
}