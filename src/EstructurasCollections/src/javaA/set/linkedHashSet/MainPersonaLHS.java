package javaA.set.linkedHashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainPersonaLHS {
    public static void main(String[] args) {
        /*
        * El metodo de ordenamiento por defecto de esta estructura es el ORDEN DE INGRESO de los elementos.
        *
        * Se deben implementar los metodos para identificar un campo de diferenciacion entre un objeto y otro (.equals()) y
        * tambien el metodo que permite redirigir la direccion de memoria de un objeto ya creado (.hasCode()).
        *
        *La sobreescritura de los metodos anteriores, permite definir el criterio de diferencicacion de cada elemento, de tal manera que
        *cuando se agrege un elemento ya ingresado anteriormente, este no se alojara en el LinkedHashSet por ser un duplicado. De otra
        *manera el criterio de differentiation por defecto, será el hashcode del propio objeto.
        * */
        Set<PersonaLHS> listado = new LinkedHashSet<>();

        PersonaLHS Mario = new PersonaLHS("Plomero", "Mario", 40);
        PersonaLHS Ana = new PersonaLHS("Ingeniera", "Ana", 27);
        PersonaLHS Camilo = new PersonaLHS("Medico", "Camilo", 20);
        PersonaLHS Camilo2 = new PersonaLHS("Medico", "Camilo", 20);
        PersonaLHS Jorge = new PersonaLHS("Abogado", "Jorge", 33);
        PersonaLHS Melissa = new PersonaLHS("Enfermera", "Melissa", 24);
        PersonaLHS Melissa2 = new PersonaLHS("Enfermera", "Melissa", 23);

        System.out.println("Comparando las melissas: "+Melissa.equals(Melissa2)+" "+Melissa.hashCode()+" "+Melissa2.hashCode()+"\n");

        listado.add(Mario);
        listado.add(Ana);
        listado.add(Camilo);
        listado.add(Camilo2);
        listado.add(Jorge);
        listado.add(Melissa);
        listado.add(Melissa2);

        for (PersonaLHS p :
                listado) {
            System.out.println(p.getTrabajo()+" "+p.getNombre()+" "+p.getEdad()+" "+p.hashCode());
        }
    }
}
