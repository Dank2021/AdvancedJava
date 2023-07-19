package javaA.set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class MainPersonaHS {
    public static void main(String[] args) {
        /*El metodo de ordenamiento por defecto de esta estructura es el HASHING. */

        Set<PersonaHS> listado = new HashSet();
        listado.add(new PersonaHS("Ingeniero","Jaime", 22));
        listado.add(new PersonaHS("Chef", "Alexander", 25));
        listado.add(new PersonaHS("Botanico", "Bernardo", 29));
        listado.add(new PersonaHS("Botanico", "Bernardo", 29));
        listado.add(new PersonaHS("Botanico", "Bernardo", 29));
        listado.add(new PersonaHS("Ingeniero","Jaime", 22));
        listado.add(new PersonaHS("Chef", "Alexander", 25));
        listado.add(new PersonaHS("Diseñadora Grafica","Lorena", 22));

        /*Cuando se crean nuevas personas de esta manera, inicialmente se reservan bloques de memoria para cada objeto, es por eso que; aunque
        algunos de estos objetos esten "repetidos" ingresaran al Set, pues a nivel de direccion de memoria son totalmente distintos

        Para solucionar esto se deben implementar dos metodos en la clase Persona, estos son HashCode y equals con el atributo a

        equals: Permite definir el campo de diferenciación entre objetos. Aquel atributo por el cual se considerara si un objeto es igual a otro
                Ej: Si el campo de diferenciación es "edad", Lorena, Jaime y el otro Jaime son considerados iguales pq los 3 tienen el campo de
                diferenciación igual.

        Hashcode: Iguala las direcciones de memoria de los objetos que se consideran iguales. Es fundamental para que un diccionario no repita
                    la agreagacion objetos, pues a nivel de diccionario, su campo de diferenciacion es el hashcode, no el campo personalizado
                    en el metodo equals.
        */


        for (PersonaHS p :
                listado) {
            System.out.println(p.getTrabajo()+" "+p.getNombre()+" "+p.getEdad()+" "+p.hashCode());
        }

        System.out.println("\n "+ listado);

        //Si que comenta .hashCode() entran todos los 6 listado, sin importar que este repetida la edad o cual sea su campo de diferenciacion
        //Sin el metodo .equals() no se pueden fijar un campo de diferenciacion, por defecto sera su bloque de memoria. Tambien ingresan los 6.
    }
}
