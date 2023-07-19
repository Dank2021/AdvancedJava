package javaA.deque;
import java.util.ArrayDeque;
import java.util.Deque;

public class DefinicionDeque {
    /*Esta estructura es un subtipo de Queue y su principal caracteristica gira en torno a su posibilidad de agregar, recuperar y eliminar
     * elementos tanto en el final como en el inicio de la fila. Su nombre reponde a (Doubled-Ended Queue). Por esa razon es de dos tipos:
     * FIFO (First In First Out): El primero en ingresar sera el primero en salir
     * LIFO (Last In First Out): El ultimo en ingresar sera el primero en salir
     *
     * Se comporta como una autentica cola en donde se las operaciones se pueden realizar en ambos bordes de la fila.
     * Algunos metodos de esta clase:
     * deque.offer/add();         Agregar elementos.
     * deque.poll/pop();          Quita y devuelve el ultimo objeto del deque.
     * deque.poll/popFirst();     Quita y devuelve el primer objeto del deque.
     * deque.poll/popLast();      Quita y devuelve el ultimo objeto del deque.
     * deque.peek();              Permite visualizar el objeto de la punta de la cola sin removerlo
     * deque.offer/add();         Agrega elementos al final del deque.
     * deque.offer/addFirst();    Agrega elementos al frente del deque.
     * deque.offer/addLast();     Agrega elementos al final del deque.
     * */

    public static void main(String[] args) throws InterruptedException {
        Deque<String> cola = new ArrayDeque() {
        };
        cola.offer("Plomero");
        cola.offer("Ingeniera");
        cola.offer("Ingeniera");
        cola.offer("Tecnico");
        cola.offerFirst("Chef");
        cola.offer("Botanico");
        cola.offer("Abogado");
        cola.offer("Enfermera");

        /*No se puede usar el ForEach porque no se puede eliminar de una cola mientras se esta en un for.
        Genera un .ConcurrentModificationException. Por eso se usa el while() */

        System.out.println(cola);
        while (!cola.isEmpty()) {
            System.out.println("Se procede a atender a " + cola.peek());

            System.out.println("Atendiendo a " + cola.poll());
            Thread.sleep(1000);
        }
    }
}
