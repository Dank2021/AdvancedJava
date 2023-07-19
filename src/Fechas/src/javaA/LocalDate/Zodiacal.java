package javaA.LocalDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zodiacal {

    public static void main(String[] args) {
        System.out.println(leerFecha());
    }

    static String calcularSigno(int dia_Nacimiento, Month mes_Nacimiento) {
        String signo = "";
        if ((mes_Nacimiento == Month.MARCH && dia_Nacimiento >= 21) || (mes_Nacimiento == Month.APRIL && dia_Nacimiento <= 19)) {
            signo = "Aries";
        } else if ((mes_Nacimiento == Month.APRIL && dia_Nacimiento >= 20) || (mes_Nacimiento == Month.MAY && dia_Nacimiento <= 20)) {
            signo = "Tauro";
        } else if ((mes_Nacimiento == Month.MAY && dia_Nacimiento >= 21) || (mes_Nacimiento == Month.JUNE && dia_Nacimiento <= 20)) {
            signo = "Géminis";
        } else if ((mes_Nacimiento == Month.JUNE && dia_Nacimiento >= 21) || (mes_Nacimiento == Month.JULY && dia_Nacimiento <= 20)) {
            signo = "Cáncer";
        } else if ((mes_Nacimiento == Month.JULY && dia_Nacimiento >= 21) || (mes_Nacimiento == Month.AUGUST && dia_Nacimiento <= 22)) {
            signo = "Leo";
        } else if ((mes_Nacimiento == Month.AUGUST && dia_Nacimiento >= 23) || (mes_Nacimiento == Month.SEPTEMBER && dia_Nacimiento <= 23)) {
            signo = "Virgo";
        } else if ((mes_Nacimiento == Month.SEPTEMBER && dia_Nacimiento >= 24) || (mes_Nacimiento == Month.OCTOBER && dia_Nacimiento <= 23)) {
            signo = "Libra";
        } else if ((mes_Nacimiento == Month.OCTOBER && dia_Nacimiento >= 24) || (mes_Nacimiento == Month.NOVEMBER && dia_Nacimiento <= 22)) {
            signo = "Escorpio";
        } else if ((mes_Nacimiento == Month.NOVEMBER && dia_Nacimiento >= 23) || (mes_Nacimiento == Month.DECEMBER && dia_Nacimiento <= 22)) {
            signo = "Sagitario";
        } else if ((mes_Nacimiento == Month.DECEMBER && dia_Nacimiento >= 23) || (mes_Nacimiento == Month.JANUARY && dia_Nacimiento <= 22)) {
            signo = "Capricornio";
        } else if ((mes_Nacimiento == Month.JANUARY && dia_Nacimiento >= 23) || (mes_Nacimiento == Month.FEBRUARY && dia_Nacimiento <= 20)) {
            signo = "Acuario";
        } else if ((mes_Nacimiento == Month.FEBRUARY && dia_Nacimiento >= 21) || (mes_Nacimiento == Month.MARCH && dia_Nacimiento <= 20)) {
        } else {
            signo = "desconocido";
        }
        return signo;
    }

    static String leerFecha() {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        boolean valida = false;
        LocalDate fechaNacimiento = null;

        System.out.println("Ingrese vuestro nombre:");
        String nombre = sc.nextLine();

        while (!valida) {
            try {
                System.out.println("Ingrese su fecha de nacimiento (dd/MM/yyyy):");
                fechaNacimiento = LocalDate.parse(sc.nextLine(), formatter);  //Leer Fecha Nacimiento
                valida = true;
            } catch (Exception e) {
                System.out.println("ERROR-Digite una fecha valida con el formato mencionado. Ejemplo: 05/03/2023");
            }
        }
        // Cálculo de la edad
        LocalDate hoy = LocalDate.now();    //Fecha Actual
        int edad = Period.between(fechaNacimiento, hoy).getYears();     //Edad

        return "Hola "+nombre+" tienes "+edad+" años y tu signo zodiacal es "+ calcularSigno(fechaNacimiento.getDayOfMonth(),fechaNacimiento.getMonth());
    }
}
