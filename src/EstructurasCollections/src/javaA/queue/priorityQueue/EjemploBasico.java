package javaA.queue.priorityQueue;

import java.util.PriorityQueue;

public class EjemploBasico {
    public static void main(String[] args) {
        PriorityQueue<Integer> colaP = new PriorityQueue();
        colaP.add(2);
        colaP.add(22);
        colaP.add(222);
        colaP.poll();
        System.out.println(colaP);
    }
}
