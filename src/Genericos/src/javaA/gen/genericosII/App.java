package javaA.gen.genericosII;

import java.util.ArrayList;
import java.util.List;

public class App {

    /*Un problema importante que los genericos solventan:
    * TypeSafety: Es la restriccion de otro tipo de datos con respecto al indicado.
        Ej: String example[] = new String[2];
        * example[0] = "Dato";  valido por ser String
        * example[1] = 'o';     No valido por no ser String. Protegido con TypeSafety
    */

    public static void main(String[] args) {
        List lista = new ArrayList();       //Las listas no tiene un typesafety por defecto.
        lista.add("cadenas");
        lista.add('a');
        lista.add(false);
        lista.add(123);                     //Permite guardar cualquier tipo de objetos.


        //Al llamar la clase necesitamos indicar los estereotipos de los genericos de la clase:
        Clase<String, Double, Boolean, Character> c = new Clase<>("Juan", 21.8, true, 'J');
        c.classType();
    }
}




















