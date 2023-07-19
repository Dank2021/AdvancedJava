import java.util.*;

public class IntroduccionLambda1 {

    static void ordenar(){

        List<Persona> lista = new ArrayList<>();
        String r = "[";
        lista.add(new Persona("Ninguno","Tif", 17));
        lista.add(new Persona("Ninguno","Juan", 22));
        lista.add(new Persona("CallCenter", "Paula", 23));
        lista.add(new Persona("Ninguno", "Mariana", 15));
        for (Persona una :
                lista) {
            r += una.getNombre()+" ";
        }
        System.out.println(r+"]");
        /*  Para ordenar objetos personalizados de alguna manera. Se debe usar Comparable o Comparator. Codigo para Comparator:
        Collections.sort(lista, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getNombre().compareTo(p2.getNombre());
                //return p1.getEdad()-p2.getEdad();
            }
        });*/

        //Usando lambdas, solo este codigo hace falta:
        Collections.sort(lista, (p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        r = "\n[";
        for (Persona elemento :
                lista) {
           r += elemento.getNombre()+" ";
        }
        System.out.println(r+"]");

    }

    public static void main(String[] args) {

        IntroduccionLambda1.ordenar();
    }
}
