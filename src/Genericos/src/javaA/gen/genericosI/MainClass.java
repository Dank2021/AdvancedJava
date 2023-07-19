package javaA.gen.genericosI;

public class MainClass {
    public static void main(String args[]) {
        // Creamos una instancia de co.javaA.genericosI.Genericos para Integer.
        Genericos<Integer> intObj = new Genericos<Integer>(88);
        intObj.classType(); //Imprimimos

        // Creamos una instancia de co.javaA.genericosI.Genericos para String.
        Genericos<String> strObj = new Genericos<String>("Test");
        strObj.classType(); //Imprimimos

    }
}
