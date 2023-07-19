package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
    /*Regular Expresion: Patrones de busqueda generalmente en cadenas de texto.*/

    public static void main(String[] args) {

        Pattern p = Pattern.compile("[abc]");
        Matcher m = p.matcher("");
        System.out.println(m.matches());

        /*Algunas Normas de las REGEX
        * (.): El . indica que no importa cual sea el caracter, permite buscar palabras con un orden especifico.
        * ..m : La tercera letra debe ser "m" y alli debe terminar.
        * .: Cualquier letra, y alli debe terminar.
        * [abc]: Indica que el texto buscado debe tener una de las letras indicadas.
        * ^[abc]: Indica que el texto buscado debe tener una letra cualquier, menos alguna de las indicadas.
        * */

    }
}
