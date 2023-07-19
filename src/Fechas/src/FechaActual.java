import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FechaActual {
    public static void main(String[] args) {
        Calendar fecha1 = new GregorianCalendar();
        System.out.printf("%-15s%s%n","Con Calendar: ",fecha1.getTime());
        System.out.printf("%-15s%d %d %d %n","Con Calendar: ",fecha1.get(Calendar.DAY_OF_MONTH),fecha1.get(Calendar.MONTH+1),fecha1.get(Calendar.YEAR));

        Date fecha2 = new Date();
        SimpleDateFormat ajustar = new SimpleDateFormat("dd-MM-yyyy");
        System.out.printf("%-15s%s%n","Con Date: ",fecha2);
        System.out.printf("%-15s%s%n","Con Date: ",ajustar.format(fecha2));

        LocalDate fecha3 = LocalDate.now();
        System.out.println("Con LocalDate: "+fecha3);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Con LocalDate: "+fecha3.format(formato));
    }
}
