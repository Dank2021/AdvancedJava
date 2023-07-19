package estadosHilos;
/*
ESTADOS DE UN HILO

Un hilo puede tener estos estados:
new :                   El hilo ha sido creado mas no inicializado. Es decir no se ha ejecutado aun el metodo start().
runnable:               Cuando se el metodo start() crea lo necesario para ejecutar el hilo, programa el thread y llama a su run().
blocked/not runnable:   El hilo se encuentra en ejecucion pero una tarea o actividad del mismo lo impide.
dead:                   Puede morir de dos formas:
                        NATURAL: Cuando run() termina normalmente.
                        ASESINADO(Detenido) cuando una instruccion
                        lo obliga a finalizar sin haber terminado completamente.
*/


public class estadosI extends Thread{

    public static void main(String[] args) throws Exception{
        //El estado new se puede represetar al momento de crear el o los hilos. Pues estan creados mas no en ejecucion:
        hilo_proceso hilo1 = new hilo_proceso();
        //El estado runnable:
        hilo1.start();
        //El estado not runnable:
        hilo1.sleep(500);
        //El estado dead:
        hilo1.stopThread(); //Solo para ejemplificar. Pues el morira de forma natural.
    }
}
