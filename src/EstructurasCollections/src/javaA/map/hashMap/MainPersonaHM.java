package javaA.map.hashMap;

import java.util.*;

public class MainPersonaHM {
    public static void main(String[] args) {
        /*El metodo de ordenamiento por defecto de esta estructura es el HASHING. */

        Map<PersonaHM, String> listado = new HashMap<>();
        listado.put(new PersonaHM("Ingeniero","Jaime", 22), "JJ");
        listado.put(new PersonaHM("Chef", "Alexander", 25), "Alex");
        listado.put(new PersonaHM("Chef", "Alexander", 25), "Alex");
        listado.put(new PersonaHM("Botanico", "Bernardo", 29), "Ber");
        listado.put(new PersonaHM("Botanico", "Bernardo", 29), "Berni");
        listado.put(new PersonaHM("Diseñadora Grafica","Lorena", 22), "Lore");

        /*Lo mas importante de la interfaz map es el key (K), es el campo de verificacion por defecto que evita elementos repetidos.
        * Pero si este key es un objeto, el campo de verificacion es el propio del objeto. Es decir el que se le defina con la sobreescritura
        * del metodo .equals().
        *
        * Otra caracteristica importante de la interfaz map es; que el campo value (V) toma el ultimo valor de una llave duplicada.
        * Ej:
        * Map<Integer, String> map = new Map<>();
        * map.put(21,"Juan");
        * map.put(21,"Daniel");
        * // map = [{21,"Daniel"}]
        *
        * No se puede imprimir una colección Map tan fácilmente como una colección Set con un bucle for-each, ya que, cada elemento de un Map
        * tiene una clave y un valor asociado, lo que requiere acceder tanto a la clave como al valor para imprimir cada entrada correctamente
        *
        * */

        //Forma 1 de iterar un Map (Lambdas):
        listado.forEach((k,v) -> System.out.println(k.getTrabajo()+" "+k.getNombre()+" "+k.getEdad()+"\t "+k.hashCode()+"\t "+v));

        //Forma 2 de iterar un Map (ForEach):
        /*for (Map.Entry<PersonaHM, String> elemento :
                listado.entrySet()) {
            System.out.println(elemento.getKey()+" "+elemento.getValue());
        }*/

        //Forma 3 de iterar un Map (Iterator):
        /*Iterator<Map.Entry<PersonaHM,String>> iterador = listado.entrySet().iterator();

        while (iterador.hasNext()){
            Map.Entry<PersonaHM,String> elemento = iterador.next();
            System.out.println(elemento.getKey()+" "+elemento.getValue());
        }*/
    }
}
