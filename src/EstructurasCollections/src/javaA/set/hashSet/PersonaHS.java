package javaA.set.hashSet;

import java.util.Objects;

public class PersonaHS {

    private final String trabajo;
    private final String nombre;
    private final int edad;

    public PersonaHS(String trabajo, String nombre, int edad) {
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
        PersonaHS persona = (PersonaHS) o;
        return edad == persona.edad;
        //Campo de diferenciacion: Edad. Pueden ser iguales en otros atributos, pero su igualdad la defina edad
    }
    @Override
    public int hashCode() {
        return Objects.hash(edad);
    }*/
}