package javaA.com.comparable;

public class Persona implements Comparable<Persona> {

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

    @Override
    public int compareTo(Persona o) {
            //Para ordenar por edad ascendente:
        return this.getEdad() - o.getEdad();    //Retornara positivo si la persona actual tiene mas edad, negativo si no o 0 si estan igual.
            //Para ordenar por nombre ascendente:
        //return this.nombre.compareTo(o.nombre);
            //Para ordenar por trabajo ascendente:
        //return this.trabajo.compareTo(o.trabajo);
            //Para ordenar por edad descendente:
        //return o.getEdad() - this.getEdad();
    }

}