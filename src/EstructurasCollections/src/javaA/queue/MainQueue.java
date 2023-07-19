package javaA.queue;
import java.util.PriorityQueue;
import java.util.Queue;

public class
MainQueue {
    public static void main(String[] args) throws InterruptedException {
        Queue<PersonaQueue> cola = new PriorityQueue<>();
        cola.offer(new PersonaQueue("Plomero", "Mario", 40));
        cola.offer(new PersonaQueue("Ingeniera", "Ana", 27));
        cola.offer(new PersonaQueue("Tecnico", "Camilo", 20));
        cola.offer(new PersonaQueue("Abogado", "Jorge", 33));

        while (!cola.isEmpty()) {
            System.out.println("Se procede a atender a " + cola.peek());

            System.out.println("Atendiendo a " + cola.poll());
            Thread.sleep(1000);
        }
    }
}
