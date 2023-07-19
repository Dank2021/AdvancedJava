package javaA.set.linkedHashSet;
import java.util.Objects;

public class PersonaLHS{

    private final String trabajo;
    private final String nombre;
    private final int edad;

    public PersonaLHS(String trabajo, String nombre, int edad) {
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
    *//*public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaLHS persona = (PersonaLHS) o;
        return edad == persona.edad;
        //Campo de diferenciacion: Edad. Pueden ser iguales en otros atributos, pero su igualdad la define edad
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.edad);
    }*/
}