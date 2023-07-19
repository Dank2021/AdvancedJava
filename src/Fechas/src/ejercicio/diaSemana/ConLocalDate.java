package ejercicio.diaSemana;

import java.time.LocalDate;

public class ConLocalDate {

    public static void main(String[] args) {
        System.out.println(findDay(25, 3, 2001));
    }
    public static String findDay(int dd, int mm, int yy){
        LocalDate dt = LocalDate.of(yy, mm, dd);
        return dt.getDayOfWeek().toString();
    }
}
