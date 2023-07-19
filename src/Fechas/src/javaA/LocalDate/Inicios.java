package javaA.LocalDate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Inicios {
    public static void main(String[] args) {

        LocalDate fecha = LocalDate.now();     //Se accede a la fecha actual
        System.out.println("Fecha actual: "+fecha);

        Scanner leer = new Scanner(System.in);

        LocalDate fecha2 = LocalDate.of(2022, 12, 4);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Fecha actual con formato: "+fecha.format(formato));
        System.out.println("Fecha actual inventada: "+fecha2);
        System.out.println("Fecha inventada con formato: "+fecha2.format(formato));
        System.out.println("Digite fecha con formato dd-MM-YYYY:");
        leer.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(leer.nextLine(), formato);
        System.out.println("Tienes: ");


    }
}
