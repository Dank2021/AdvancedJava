package javaA.com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
                                        //USANDO COMPARABLE
public class Main {
    //Usualmente para ordenar listas, con el metodo .sort es suficiente, ya que los datos de dicha lista pueden primitivos o compuestos.
    // Pero cuando se requiere ordenar una lista de objetos, que posean diferentes atributos, la manera en como estos deben ser ordenados
    // debe ser personalizada por el desarrollador, pues el metodo sort no puede adivinar como desea que se ordenen estos objetos.

    public static void main(String[] args) {
        //Si la lista esta conformada por objetos con atributos, la forma de ordenarla, puede variar:
        List<Persona> empleados = new ArrayList<>();
        empleados.add(new Persona("Ingeniero","Jaime", 22));
        empleados.add(new Persona("Mesero", "Gimena", 34));
        empleados.add(new Persona("Botanico", "Bernardo", 29));
        empleados.add(new Persona("Chef", "Alexander", 25));
        empleados.add(new Persona("Abogado", "Camilo", 48));

        //Por medio de la interfaz comparable que se implementa directamente en la clase, se puede ordenar una lista de objetos con varios atributos.

        Collections.sort(empleados);

        /*A diferencia del uso de la interfaz Comparable, con la interfaz Comparator podemos con menos codigo obtener resultados similares.
        * Pues a pesar de que no es tan visible (no necesitamos ni sobreescribir la interfaz en los parametros del metodo .sort() ni tuvimos
        * que crear una nueva clase para implementar de igual manera la interfaz) la funcion de ordenamiento se cumple segun como se haya implementado
        * y sobreescrito el metodo CompareTo() en la clase Persona*/

        /*Como en la sobreescritura de metodos se altero de tal manera que ordene segun la edad ascendentemente, la lista se ha ordenado segun la edad.
        * Para que se ordene por nombre hay que ir al metodo y re ajustarlo o en este caso descomentar y comentar la actual sobreescritura*/
        for (Persona p :
                empleados) {
            System.out.println(p.getNombre() +" "+p.getEdad()+" "+p.getTrabajo());
        }
    }
}
