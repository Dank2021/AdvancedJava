package Formatting;

public class FormatearEj {
    public static void main(String[] args) {
        System.out.println("================================");

            String s1="Java";
            String s2="Python";
            String s3="C++";
            int x= 23;
            int y= 12;
            System.out.printf("%-15s%03d%n", s1, x);
            System.out.printf("%-8s%-8s%-8s%n", s1, s2, s3);
            System.out.printf("%-15s%03d%n", s2, y);
        System.out.println("================================");
            System.out.printf("%b%n", null);
            System.out.printf("%B%n", null);
        System.out.println("================================");
            System.out.printf("%s%n", "juan");
            System.out.printf("%S%n", "juan");
        System.out.println("================================");
            System.out.printf("%6.4s", "Hi there!");
    }
}

/*
* %-15s: Especifica un espacio de ancho fijo de 15 caracteres (-15) para imprimir una cadena (s). El signo de - alineará la cadena a la izquierda en el espacio asignado.
* %15s:  Especifica un espacio de ancho fijo de 15 caracteres (15) para imprimir una cadena (s). La falta de signo alineará la cadena a la derecha en el espacio asignado.
* %03d:  Especifica un espacio de ancho fijo de 3 caracteres (3) para imprimir un número entero (d). El número se rellenará con ceros a la izquierda si tiene menos de 3 dígitos.
*
* Conversion Characters: Defines how the argument is formatted
* %s formats strings.
* %X.Ys formats strings; X de aligment, Y the total size of the string
* %d formats decimal integers.
* %f formats floating-point numbers.
* %t formats date/time values.
* %b formats the boolean value of the argument. false if argument is null.
* %B formats the Boolean value of the argument. FALSE if argument is null.
* %n Line separator
*/
