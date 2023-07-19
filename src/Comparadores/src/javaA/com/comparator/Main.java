package javaA.com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    //Usualmente para ordenar listas, con el metodo .sort es suficiente, ya que los datos de dicha lista pueden ser primitivos o
    // compuestos. Pero cuando se requiere ordenar una lista de objetos, que posean diferentes atributos, la manera en como estos
    // deben ser ordenados debe ser personalizada por el desarrollador, pues el metodo sort no puede adivinar como desea que
    // se ordenen estos objetos.

    public static void main(String[] args) {
        List<String> familia = new ArrayList<>();
        familia.add("Padre");
        familia.add("Hija");
        familia.add("Madre");
        familia.add("Abuelo");
        familia.add("Bisabuela");
        Collections.sort(familia);      //Con este metodo se pueden organizar los objetos, independientemente el tipo de dato que tengan.
        System.out.println(familia);

        //Pero si la lista esta conformada por objetos con atributos, la forma de ordenarla, puede variar:
        List<Persona> empleados = new ArrayList<>();
        empleados.add(new Persona("Ingeniero","Jaime", 22));
        empleados.add(new Persona("Mesero", "Gimena", 34));
        empleados.add(new Persona("Chef", "Alexander", 25));
        empleados.add(new Persona("Abogado", "Camilo", 48));

        //Collections.sort(empleados);
        /*Al intentar utilizar sort nuevamente con esta lista, nos arrojara un error pues el tipo de dato T que le ingresamos no se ajusta al Comparable
            * Para solucionar este error hay dos caminos:
            *
            * 1) Crear una clase especifica para el ordenamiento haciendo uso de un tipo de dato de Persona, esta clase la llamaremos PersonaComparatorEdad
        */
        Collections.sort(empleados, new PersonaComparatorEdad());    //Con la nueva clase podemos hacer uso de el metodo sort de Collections y ordenar a nuestro gusto

        for (Persona p :
                empleados) {
            System.out.println(p.getNombre()+"\t"+p.getEdad());     //Se ordena segun la edad
        }
        System.out.println("------------------------------------------------------------------------------------");
        /*
        * 2) Sobreescribir el metodo compare de comparator en el mismo espacio en el que se debe enviar el parametro. Sin tener que crear una clase nueva
        */
        Collections.sort(empleados, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });

        for (Persona p :
                empleados) {
            System.out.println(p.getNombre()+"\t"+p.getEdad());     //Se ordena segun el nombre.
        }
    }
}
