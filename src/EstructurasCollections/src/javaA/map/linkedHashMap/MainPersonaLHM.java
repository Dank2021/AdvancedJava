package javaA.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MainPersonaLHM {
    public static void main(String[] args) {
        /*
        * El metodo de ordenamiento por defecto de esta estructura es el ORDEN DE INGRESO de los elementos.
        *
        * Se deben implementar los metodos para identificar un campo de diferenciacion entre un objeto y otro (.equals()) y
        * tambien el metodo que permite redirigir la direccion de memoria de un objeto ya creado (.hasCode()).
        *
        *La sobreescritura de los metodos anteriores, permite definir el criterio de diferenciación de cada elemento, de tal manera que
        *cuando se agrege un elemento ya ingresado anteriormente, este no se alojara en el LinkedHashMap por ser un duplicado. De otra
        *manera el criterio de diferenciación por defecto, será el hashcode del propio objeto.
        * */
        Map<PersonaLHM, String> listado = new LinkedHashMap<>();

        PersonaLHM Mario = new PersonaLHM("Plomero", "Mario", 40);
        PersonaLHM Ana = new PersonaLHM("Ingeniera", "Ana", 27);
        PersonaLHM Camilo = new PersonaLHM("Medico", "Camilo", 20);
        PersonaLHM Camilo2 = new PersonaLHM("Medico", "Camilo", 20);
        PersonaLHM Jorge = new PersonaLHM("Abogado", "Jorge", 33);
        PersonaLHM Melissa = new PersonaLHM("Enfermera", "Melissa", 24);
        PersonaLHM Melissa2 = new PersonaLHM("Enfermera", "Melissa", 23);

        System.out.println("Comparando las melissas: "+Melissa.equals(Melissa2)+" "+Melissa.hashCode()+" "+Melissa2.hashCode()+"\n");

        listado.put(Mario, "Bambino");
        listado.put(Ana, "Ann");
        listado.put(Camilo, "Cami");
        listado.put(Camilo2, "Cami");
        listado.put(Jorge, "Jorgi");
        listado.put(Melissa, "Mel");
        listado.put(Melissa2, "Mel");

        listado.forEach((k,v) -> System.out.println(k.getTrabajo()+" "+k.getNombre()+" "+k.getEdad()+" "+k.hashCode()+" "+v));
    }
}
