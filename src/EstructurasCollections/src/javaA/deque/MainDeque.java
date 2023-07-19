package javaA.deque;

import java.util.ArrayDeque;
import java.util.Deque;


public class MainDeque {
    public static void main(String[] args) throws InterruptedException {
        Deque<PersonaDeque> cola = new ArrayDeque<>();
        cola.offer(new PersonaDeque("Plomero", "Mario", 40));
        cola.offer(new PersonaDeque("Ingeniera", "Ana", 27));
        cola.offer(new PersonaDeque("Tecnico", "Camilo", 20));
        cola.offer(new PersonaDeque("Abogado", "Jorge", 33));
        cola.offerFirst(new PersonaDeque("Abogado", "Jorge", 33));


        while (!cola.isEmpty()) {
            System.out.println("Se procede a atender a " + cola.peek());

            System.out.println("Atendiendo a " + cola.poll());
            Thread.sleep(1000);
        }
    }
}
