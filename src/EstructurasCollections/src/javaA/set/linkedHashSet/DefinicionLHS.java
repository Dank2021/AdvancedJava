package javaA.set.linkedHashSet;

import java.util.Set;
import java.util.TreeSet;

public class DefinicionLHS {
    public static void main(String[] args) {
        //LinkedHashSet: Se asegura que no existan valores unicos y tiene un orden predeterminado segun el orden de adicion a la coleccion.
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
