package Strings;

public class StringBufferBuilder {
    /*Ambas son utilizados cuando se necesita manipular cadenas de caracteres en tiempo de ejecución, (cuando no se sabe el tamaño exacto de la
    * cadena a construir y se necesita ir agregando caracteres a medida que avance)
    *
    * StringBuilder: Es una clase no sincronizada (No segura para subprocesos). Se debe usar en entornos en los que solo un subproceso puede
    * acceder y modificar una cadena en un momento dado. No tiene metodos con la palabra Synchronized
    *
    * StringBuffer:Clase síncrona es ThreadSafe. Es seguro para subprocesos, lo que significa que se puede utilizar de forma segura en entornos
    * en los que múltiples subprocesos pueden acceder y modificar una misma cadena de forma concurrente. Tiene metodos con la palabra Synchronized
    *
    * */

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Juan");   //Al usar este constructor, la capacidad sera 16 + String.lenght() del argumento
        sb.append("Ramirez Reyes Tom");   //Pero la longitud se duplica una vez superada la capacidad
        System.out.println("Capacidad: " + sb.capacity());
        System.out.println("Longitud: "+ sb.length());
        System.out.println("En reversa: "+ sb.reverse());
        System.out.println("En reversa x2 para que quede en orden: "+ sb.reverse());
        System.out.println(sb);

        /*Se puede cambiar el StringBuilder por un StringBuffer, pues ambos tienen los mismos metodos. Ambos implementan AbstractStringBuilder*/
    }
}
