import java.util.ArrayList;
import java.util.List;

public class Main {

    //La palabra reservada instanceof nos permite conocer si un objeto es una instancia de otro, devuelve un boolean.
    static List canasta = new ArrayList();
    public static void main(String[] args) {

        //Crear un alista donde solo se permita agregar carnes:

        Jamon j1 = new Jamon();
        Jamon j2 = new Jamon();
        Galletas g1 = new Galletas();
        Galletas g2 = new Galletas();
        Sardinas s1 = new Sardinas();
        Sardinas s2 = new Sardinas();
        Sardinas s3 = new Sardinas();

        verificar(j1);
        verificar(j2);
        verificar(g1);
        verificar(g2);
        verificar(s1);
        verificar(s2);
        verificar(s3);
    }

     static void verificar(Object objeto){
        if (objeto instanceof Carnes) {
           canasta.add(objeto);
            System.out.println("Elemento agregado: "+ ((Carnes) objeto).nombre);
        }else {
            System.out.println(((Galletas)objeto).nombre+" No es una carne");
        }
    }
}