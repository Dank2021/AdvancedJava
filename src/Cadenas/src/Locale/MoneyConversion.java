package Locale;

import java.text.NumberFormat;
import java.util.Locale;

public class MoneyConversion {
    public static void main(String[] args) {
        double payment = 2345.3;

        Locale INDIA = new Locale("en","IN");
        Locale USTATES = new Locale("en", "US");

        String us = NumberFormat.getCurrencyInstance(USTATES).format(payment);
        String india = NumberFormat.getCurrencyInstance(INDIA).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
