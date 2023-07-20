package EjerciciosHackerR;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {
    /*Regular Expresion: Patrones de busqueda generalmente en cadenas de texto.*/

    public static void main(String[] args) {

        String text = "Buena noche esta noche esta muy oscuro porque esta de NOCHE";
        //String text = "noche";
        /*El 2do parametro permite que la regex no distinga entre Uppercase y Lowercase*/
        Pattern p = Pattern.compile("noche", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);

        System.out.println(m.matches());    //Si toda la cade es una coincidencia
        System.out.println(m.lookingAt());  //Si y solo si encotro alguna coincidencia al INICIO

        System.out.println(m.replaceAll("dia"));    //Reemplazamos las coincidencias con "dia". Se reinicia el Matcher
        m = p.matcher(text);    //Con algun metodo del Matcher que coincida (.replaceAll), se debe reiniciar el matcher.
        int coincidencias = 0;
        while (m.find()){
            coincidencias++;
            System.out.println("Coincidencia "+coincidencias+" inicia en: "+m.start()+" termina en: "+m.end());
        }
    }
}
