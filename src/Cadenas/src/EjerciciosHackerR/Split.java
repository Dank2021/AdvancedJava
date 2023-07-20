package Strings;

public class Split {
    public static void main(String[] args) {
        String cadena ="Juan;Ramirez;Reyes";
        String[] extraccion = cadena.split(";");    //Dividimos los elemento de la cadena cada que se encuentre un ";"
        for (String e :
                extraccion) {
            System.out.println(e);
        }
        System.out.println("************************************************");
        /*Hasta aca el algoritmo se comporta muy intuitivamente pero en el siguiente ejemplo veremos una particularidad
        ya no tan obvia*/

        String cadena2 = new String("Juan|Ramirez|Reyes|Esta");
        extraccion = cadena2.split("|", 6); //Se esperaria que divida la cadena cada "|"
        for (String e :
                extraccion) {
            System.out.println(e);      //Pero realiza un proceso totalmente distinto.
        }   //los parametros del metodo split.("|", 6) equivalen a dividir la cadena caracter por caracter, maximo 6 veces.
        System.out.println("************************************************");
        extraccion = cadena2.split("\\|", 5);
        /*No se debe olvidar que .split() tiene entre sus parametro una Regex, por lo que "|" se lee como Regex.
        * Para que divida la cadena guiandose por el caracter "|"; se debe colocar asi "\\|"*/
        for (String e :
                extraccion) {
            System.out.println(e);
        }
    }
}
