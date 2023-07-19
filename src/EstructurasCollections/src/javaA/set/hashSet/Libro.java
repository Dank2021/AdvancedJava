package javaA.set.hashSet;

import java.util.Objects;

public class Libro {
    private final String nombre;
    private final String author;
    private final int ISBN;

    public Libro(String nombre, String author, int ISBN) {
        this.nombre = nombre;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;         //1ro: Verificar si el objeto que ingresa es de la clase Libro. Si si, true
//        if (o == null || getClass() != o.getClass()) return false;      //Si pertetenece a otra clase distinta, false
//        Libro libro = (Libro) o;        //Casteamos el el objeto ingresado a un objeto Libro
//        return ISBN == libro.ISBN;      //Comparamos ambos libros por medio del parametro deseado. En este caso ISBN
//        //return author.equals(libro.author);
//        //return nombre.equals(libro.nombre);
//    }
//
//    @Override
//    public int hashCode() {
//         /*Usualmente, el hashcode de un objeto es un número bastante extenso, al sobreescribir este método el hascode se acorta
//        * y para el caso de los objetos repetidos o no repetidos segun el equals y como se sobreescriba, este método también permite
//        * ajustar la direccion de memoria del objeto creado, de tal manera que aunque se creen dos objetos, que en sus atributo de diferencia
//        * posean valores iguales, la referencia o la direccion de memoria de ambos sea la misma
//*/
//        return Objects.hash(ISBN);
//    }
}
