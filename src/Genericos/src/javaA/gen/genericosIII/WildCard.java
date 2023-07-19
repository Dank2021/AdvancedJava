package javaA.gen.genericosIII;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    /*Los wildCard permiten ejecutar los genericos sin indicar el tipo de dato*/
    public void listarUpperBounded(List<? extends Persona> lista) {//Hace referencia a herencia e implementaciones de la clase indicada
        //Solo acepta cualquier objeto que sea subclase de Persona
        for (Persona per : lista) {
            //if(a instanceof Alumno){
            System.out.println(per.getNombre());
            //}else if(a instanceof Profesor){
            //}
        }
    }

    public void listarLowerBounded(List<? super Alumno> lista) {        //Hace referencia a clases padre de la clase indicada
        //Solo acepta cualquier objeto que sea superclase de Alumno
        for (Object al : lista) {
            //if(a instanceof Alumno){
            System.out.println(((Persona)al).getNombre());
            //}else if(a instanceof Profesor){
            //}
        }
    }

    public void listarUnBounded(List<?> lista) {        //Wildcard unknow, no se inidica la implementacion o el tipo de dato que implementa el parametro o en este caso la lista.
        for (Object al : lista) {                       //Se coloca Object ya que el wildcard es unknow
            //if(a instanceof Alumno){                  Los if sirven como filtro si se decide indicar el tipo de dato
            System.out.println(((Persona)al).getNombre());
            //}else if(a instanceof Profesor){
            //}
        }
    }

    public static void main(String[] args) {
        WildCard aw = new WildCard();

        Persona al1 = new Persona("MITOCODE");
        Persona al2 = new Persona("JAIME");
        Persona al3 = new Persona("MITO");

        List<Persona> lista = new ArrayList<>();
        lista.add(al1);
        lista.add(al2);
        lista.add(al3);

        aw.listarUpperBounded(lista);
        System.out.println();
        aw.listarLowerBounded(lista);
        System.out.println();
        aw.listarUnBounded(lista);
    }
}