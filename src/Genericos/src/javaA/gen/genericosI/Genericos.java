package javaA.gen.genericosI;

public class Genericos <T>{
    /*Establecen las relaciones de nivel tipo; permitiendo que ciertas clases, interfaces o métodos,
    acepten únicamente los tipos estipulados.*/
    T obj;
    /*Unos apuntes:
    T es el tipo genérico que será reemplazado por un tipo real.
    T es el nombre que damos al parámetro genérico.
    Este nombre se sustituirá por el tipo real que se le pasará a la clase.
    */
    public Genericos(T o) {
        obj = o;
    }

    public void classType() {
        System.out.println("El objeto es de tipo: " + obj.getClass().getName());
    }

    /*
    Existen una serie de convenciones para nombrar a los genéricos:
        E – Element (usado bastante por Java Collections Framework)
        K – Key (Llave, usado en mapas)
        N – Number (para números)
        T – Type (Representa un tipo, es decir, una clase)
        V – Value (representa el valor, también se usa en mapas)
        S,U,V etc. – usado para representar otros tipos.
    */
}


