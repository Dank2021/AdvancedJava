package javaA.stack;

import java.util.Stack;

public class DefinicionStack {
    /*Esta estructura admite duplicados y su principal caracteristica gira en torno a su orden de ingreso, pues es una estructura del tipo
     * LIFO (Last In First Out) : El ultimo en ingresar es el primero en salir.
     *
     * Se comporta como una autentica pila donde solo podemos quitar del ultimo objeto.
     * Algunos metodos de esta clase:
     * stack.push();    Agregar elementos
     * stack.pop();     Quita y devuelve el ultimo objeto ingresado de la pila
     * stack.peek();    Permite visualizar el objeto de la punta de la pila sin removerlo
     * */
    public static void main(String[] args) throws InterruptedException {
        Stack<String> pila = new Stack<>();
        pila.push("Plomero");
        pila.push("Ingeniera");
        pila.push("Tecnico");
        pila.push("Abogado");
        pila.push("Enfermera");
        pila.push("Enfermera");

        int i = 0;
        for (String elemento : pila) {
            System.out.println((i++)+" "+elemento);
        }

        System.out.println("Tope " + pila.peek());
        System.out.println("Search " + pila.search("Abogado"));
        while(!pila.isEmpty()){
            System.out.println("Atendiendo a " + pila.pop());
            Thread.sleep(1000);
        }
    }
}
