package javaA.set.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class DefinicionTS {
    public static void main(String[] args) {

        //Ofrece ordenar los elementos (alfabeticamente o numericamente) que se agreguen, no admite repetidos.
        //En caso de querer hacer un Set de objetos, se debe implementar la interfaz Comparable.
        Set <String> lista = new TreeSet();

        lista.add("planeta");
        lista.add("llanta");
        lista.add("arequipe");
        lista.add("luna");
        lista.add("juna");

        for (String k :
                lista) {
            System.out.println(k);
        }


    }
}
