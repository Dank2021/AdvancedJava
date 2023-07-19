package sincornizacionHilos;

public class sinc_principal {
    public static void main(String[] args) throws InterruptedException{
        hilo_1 hilo1 = new hilo_1();
        hilo_2 hilo2 = new hilo_2();
        hilo_3 hilo3 = new hilo_3();
        hilo_4 hilo4 = new hilo_4();

        hilo1.start();
        hilo1.sleep(250);
        hilo2.start();
        hilo2.sleep(250);
        hilo3.start();
        hilo3.sleep(250);   //400+400+188= 988 : Es casi 1s, es decir que justo a tiempo todos los hilos ejecutaran su codigo antes de que hilo_1 vuelva a ejecutar el suyo.
        hilo4.start();
        hilo4.sleep(250);
        /*NOTA: Si bien se podria pensar que en lugar de 188 se podria colocar 199 o 200, se debe tener en cuenta que las lecturas no son inmediatas y que
        * tambien exite un tiempo en el que se leera tanto los start() como los run() que suponemos es de 12 milisegundos.
        *
        * Inexplicacion: Al eliminar hilo_4.sleep(1000) el programa falla y la sincronia no es la correcta. Al igual que si se cambia hilo_4 a otro hilo_n.
        * */


        /*
        * SINCRONIZACION DE HILOS
        * Para este programa, la idea es que cada hilo imprima una letra, de tal manera que juntando la accion de todos los hilos
        * se forme una palabra.
        *
        * Sin embargo, la sincronía de ellos debe ser lo suficientemente buena para que ninguno ejecute su accion antes de su "turno".
        *
        * Quiere decir que el tiempo de espera que cada hilo tenga en su codigo, debe ser mayor al tiempo de espera que existe entre
        * la ejecucion de los demás hilos en la clase principal.
        *
        * Es decir, si hilo_1 imprime una J cada segundo, lo que tarden las demas letras (u,a y n) en imprimirse, no debe ser mayor a
        * 1s, ya que es el tiempo limite del hilo_1 para esperar y colocar una J nueva. Esta misma logica se acomoda a los demás
        * hilos:
        * "Me ejecuto cada x tiempo. En ese x tiempo los demas deben terminar su ejecucion o chocaremos".
        *
        * Notese que hay diferencia entre el tiempo que se tardan los hilos por separado (El tiempo ajustado en su propio metodo run) y
        * el tiempo que tardara el compilador en leer todos los start() de los hilos en la clase principal. El primero esta en un ciclo,
        * el segundo es solo una vez.
        * */
    }
}
