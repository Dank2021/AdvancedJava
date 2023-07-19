package javaA.queue;
import java.util.PriorityQueue;
import java.util.Queue;

public class DefinicionQueue {
    /*Esta estructura admite duplicados y su principal caracteristica gira en torno a su orden, el cual es definido por el orden natural de
     * los elementos o por un comparador. Es del tipo:
     * FIFO (First In First Out) : El primero en ingresar sera el primero en salir
     *
     * Se comporta como una autentica cola de prioridad donde se elimina el primero en llegar.
     * Algunos metodos de esta clase:
     * stack.offer();    Agregar elementos.
     * stack.poll();     Quita y devuelve el ultimo objeto ingresado de la cola
     * stack.peek();     Permite visualizar el objeto de la punta de la cola sin removerlo
     * */

    public static void main(String[] args) throws InterruptedException {
        Queue<String> cola = new PriorityQueue<>();
        cola.offer("Plomero");
        cola.offer("Ingeniera");
        cola.offer("Ingeniera");
        cola.offer("Tecnico");
        cola.offer("Chef");
        cola.offer("Botanico");
        cola.offer("Abogado");
        cola.offer("Enfermera");

        /*No se puede usar el ForEach porque no se puede eliminar de una cola mientras se esta en un for.
        Genera un .ConcurrentModificationException. Por eso se usa el while() */
        System.out.println(cola);
        while (!cola.isEmpty()) {
            System.out.println("Se procede a atender a " + cola.peek());

            System.out.println("Atendiendo a " + cola.poll());
        }

        Queue<Integer> numeros = new PriorityQueue();
        numeros.offer(4);
        numeros.offer(99);
        numeros.offer(33);
        numeros.offer(302);
        numeros.offer(6);
        numeros.offer(12);

        for (Integer j :
                numeros) {
            System.out.println(j);
        }

    }



}
