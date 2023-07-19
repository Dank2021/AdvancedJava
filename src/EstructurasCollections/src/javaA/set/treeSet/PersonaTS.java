package javaA.set.treeSet;

public class PersonaTS implements Comparable<PersonaTS>{

    private final String trabajo;
    private final String nombre;
    private final int edad;

    public PersonaTS(String trabajo, String nombre, int edad) {
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
        PersonaTS persona = (PersonaTS) o;
        return this.getNombre().equals(persona.getNombre());
        //Campo de diferenciacion: Edad. Pueden ser iguales en otros atributos, pero su igualdad la defina edad
    }
    @Override
    public int hashCode() {return Objects.hash(nombre);
    }
*/
    @Override
    public int compareTo(PersonaTS o) {
        //Si el campo de diferenciacion lo define la edad, ordenara por edad la lista y en eso se basara para evitar objetos duplicados.
        return this.edad - o.edad;
        //return this.nombre.compareTo(o.nombre);
    }
}