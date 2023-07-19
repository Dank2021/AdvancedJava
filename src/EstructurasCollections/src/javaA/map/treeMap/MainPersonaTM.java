package javaA.map.treeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MainPersonaTM {
    public static void main(String[] args) {
        /*
        * El metodo de ordenamiento por defecto de esta estructura es ASCENDENTE segun el tipo de dato.
        *
        * Cuando se trata de una estructura que ordena por defecto ascendentemente. Pero si se desea ordenar de forma perzonalizada,
        * es obligatorio implementar la interfaz Comparable en la clase del objeto a ordenar. Puesto que es con ello que define el orden
        * de ascendencia de los objetos.
        *
        * EN ESTA ESTRUCTURA, SE ORDENA Y SE DIFERENCIAN LOS OBJETOS CON EL MISMO CAMPO!!!. Es decir el metodo .compareTo() es el que decide
        * si un objeto es igual, mayor o menor a otro y, a su vez, utiliza esa decision de comparacion para ordenarlos.
        *
        * El .compareTo() es el alma del TreeMap, el define que elementos ingresan y define su igualdad o diferencia.
        * Y al tener un ordenamiento por defecto, se recuesta en el .compareTo() personalizado para ordenar los objetos, de la misma manera
        * en que lo haria con otros tipos de dato con los que puede ordenar por defecto, como los int, o los double o los String.
        *
        * Quiere decir que no sirve de nada implementar los metodos .equals() y .hashCode().
        * */

        Map<PersonaTM, String> listado = new TreeMap<>();

        PersonaTM Mario = new PersonaTM("Plomero", "Mario", 40);
        PersonaTM Ana = new PersonaTM("Ingeniera", "Ana", 27);
        PersonaTM Camilo = new PersonaTM("Tecnico", "Camilo", 20);
        PersonaTM Jorge = new PersonaTM("Abogado", "Jorge", 33);
        PersonaTM Melissa = new PersonaTM("Enfermera", "Melissa", 24);
        PersonaTM Melissa2 = new PersonaTM("Enfermera", "Melissa", 24);

        System.out.println("Comparando las melissas: "+Melissa.equals(Melissa2)+" "+Melissa.hashCode()+" "+Melissa2.hashCode()+"\n");

        listado.put(Mario, "Bambino");
        listado.put(Ana, "Ann");
        listado.put(Camilo, "Cami");
        listado.put(Jorge, "Jorgi");
        listado.put(Melissa, "Mel");
        listado.put(Melissa2, "Mel");

        listado.forEach((k,v) -> System.out.println(k.getTrabajo()+" "+k.getNombre()+" "+k.getEdad()+" "+k.hashCode()+" "+v));
    }
}
