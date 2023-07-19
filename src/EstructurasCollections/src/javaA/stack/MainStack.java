package javaA.stack;
import java.util.Stack;

public class MainStack {


    public static void main(String[] args) throws InterruptedException {
        Stack<PersonaStack> pila = new Stack<>();
        pila.push(new PersonaStack("Plomero", "Mario", 40));
        pila.push(new PersonaStack("Ingeniera", "Ana", 27));
        pila.push(new PersonaStack("Tecnico", "Camilo", 20));
        pila.push(new PersonaStack("Abogado", "Jorge", 33));
        pila.push(new PersonaStack("Enfermera", "Melissa", 24));
        pila.push(new PersonaStack("Enfermera", "Melissa", 24));

        int i = 0;
        for (PersonaStack elemento : pila) {
            System.out.println((i++)+" "+elemento);
        }

        System.out.println("Tope " + pila.peek());
        System.out.println("Search " + pila.search(new PersonaStack("Abogado", "Jorge", 33)));
        while(!pila.isEmpty()){
            System.out.println("Atendiendo a " + pila.pop());
            Thread.sleep(1000);
        }
    }
}
