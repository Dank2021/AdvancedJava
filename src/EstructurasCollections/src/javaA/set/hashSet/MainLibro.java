package javaA.set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class MainLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El mundo y sus demonios", "Carl Sagan", 89);
        Libro libro2 = new Libro("El mundo y sus demonios", "Carl Sagan", 89);

        if (libro2.equals(libro1)) {        //Sin sobreescribir el método equals(), la respuesta será que no son iguales, pues las direcciones de memoria son distintas
            System.out.println("Los libros son iguales: "+ libro1.hashCode()+" "+libro2.hashCode());
        } else{
            System.out.println("Los libros no son iguales: "+ libro1.hashCode()+" "+libro2.hashCode());
        }
        /*Sobreescribiendo el método .equals() de tal manera que distinga un libro de otro segun su ISBN, podremos identificar libros iguales
        * sin importar que su direction de memoria sea distinta*/

        Set<Libro> libreria = new HashSet<>();
        libreria.add(libro1);
        libreria.add(libro2);

        /* Sin la sobre escritura del método .hashCode(), podemos agregar el mismo libro varias veces, esto porque, todos los
         nuevos libros que se crean y agregan poseen diferentes direcciones o referencias de memoria sin importar que el ISBN sea el mismo.

         No solamente es necesario indicar cuál es el campo o atributo por el que deseamos diferenciar un objeto (en este caso ISBN) sino
         también debemos asegurarnos de que la creacion de un nuevo objeto con el mismo campo de diferenciación que otro (ISBN en este caso),
         cambie su direccion de memoria a la del objeto ya agregado. Ejemplo:

         Sin sobreescribir el hashCode pero si el .equals() con campo de diferenciacion ISBN:
         */

//           libro1 = new Libro("El mundo y sus demonios", "Carl Lazio", 89); HashCode: 13211421
//           libro1 = new Libro("El mundo y sus demonios", "Carl Sagan", 89); HashCode: 65756123
//           librería.add(libro1);
//           librería.add(libro2);
//           libreria = {libro1, libro2}

        /* Ambos con el mismo ISBN, no deberian haberse agregado, pero lo hacen pq al set libreria no le importa el ISBN, sino el hashcode.

           Sobreescribiendo el hashCode:*/
//           new Libro("El mundo y sus demonios", "Carl Lazio", 89); HashCode: 13
//           new Libro("El mundo y sus demonios", "Carl Sagan", 89); HashCode: 13
//           librería.add(libro1);
//           librería.add(libro2);
//           libreria = {libro1}


        for (Libro l :
                libreria) {
            System.out.println(l.getISBN()+" "+ l.getAuthor() +" "+ l.getNombre());
        }
    }
}
