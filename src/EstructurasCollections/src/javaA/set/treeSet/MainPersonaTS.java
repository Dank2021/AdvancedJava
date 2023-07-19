package javaA.set.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class MainPersonaTS {
    public static void main(String[] args) {
        /*
        * El metodo de ordenamiento por defecto de esta estructura es ASCENDENTE segun el tipo de dato.
        *
        * Cuando se trata de una estructura que ordena por defecto o si en general se desea ordenar de forma perzonalizada,
        * es obligatorio implementar la interfaz Comparable en la clase del objeto a ordenar. Puesto que el Collections.sort() solo
        * acepta listas.
        *
        * EN ESTA ESTRUCTURA, SE ORDENA Y SE DIFERENCIAN LOS OBJETOS CON EL MISMO CAMPO!!!. Es decir el metodo .compareTo() es el que decide
        * si un objeto es igual, mayor o menor a otro y, a su vez, utiliza esa decision de comparacion para ordenarlos.
        *
        * El .compareTo() es el alma del TreeSet, el define que elementos ingresan y define su igualdad o diferencia.
        * Y al tener un ordenamiento por defecto, se recuesta en el .compareTo() personalizado para ordenar los objetos, de la misma manera
        * en que lo haria con otros tipos de dato con los que puede ordenar por defecto, como los int, o los double o los String.
        *
        * Quiere decir que no sirve de nada implementar los metodos .equals() y .hashCode().
        * */

        Set<PersonaTS> listado = new TreeSet<>();

        PersonaTS Mario = new PersonaTS("Plomero", "Mario", 40);
        PersonaTS Ana = new PersonaTS("Ingeniera", "Ana", 27);
        PersonaTS Camilo = new PersonaTS("Tecnico", "Camilo", 20);
        PersonaTS Jorge = new PersonaTS("Abogado", "Jorge", 33);
        PersonaTS Melissa = new PersonaTS("Enfermera", "Melissa", 24);
        PersonaTS Melissa2 = new PersonaTS("Enfermera", "Melissa", 24);

        System.out.println("Comparando las melissas: "+Melissa.equals(Melissa2)+" "+Melissa.hashCode()+" "+Melissa2.hashCode()+"\n");

        listado.add(Mario);
        listado.add(Ana);
        listado.add(Camilo);
        listado.add(Jorge);
        listado.add(Melissa);
        listado.add(Melissa2);

        for (PersonaTS p :
                listado) {
            System.out.println(p.getTrabajo()+" "+p.getNombre()+" "+p.getEdad()+" "+p.hashCode());
        }
    }
}
