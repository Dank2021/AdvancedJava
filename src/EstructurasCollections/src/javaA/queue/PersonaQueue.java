package javaA.queue;

import java.util.Objects;

public class PersonaQueue implements Comparable<PersonaQueue>{

    private final String trabajo;
    private final String nombre;
    private final int edad;

    public PersonaQueue(String trabajo, String nombre, int edad) {
        this.trabajo = trabajo;
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    public String getTrabajo() {return trabajo;}

    public int getEdad() { return edad; }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaQueue persona = (PersonaQueue) o;
        return edad == persona.edad;
        //Campo de diferenciacion: Edad. Pueden ser iguales en otros atributos, pero su igualdad la defina edad
    }
    @Override
    public int hashCode() {
        return Objects.hash(edad);
    }*/

    @Override
    public String toString() {
        return "{" +
                "trabajo='" + trabajo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(PersonaQueue o) {
        return this.edad - o.edad;
    }
}