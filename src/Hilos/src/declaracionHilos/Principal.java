package declaracionHilos;

public class Principal {

    /*Hay 3 maneras de instanciar un hilo:
    * Extendiendo de Thread: La clase que se vaya a usar como hilo debe hacer la herencia de Thread y sobreescribir el metodo run().
    * Implementando Runnable desde la clase:
    *    La clase que se vaya a usar como hilo debe hacer la implementacion de Runnable y sobreescribir el metodo run().
    * Implementando Runnable en clase anonima:
    * */
    public static void main(String[] args) {

        //Instanciar hilos con clases hijas de Thread:
        Proceso1 hilo1 = new Proceso1("Hilo 1");
        //Usamos la misma clase Proceso1 pero inicializamos con otro constructor para no dejarlo sin usar :V
        Proceso1 hilo2 = new Proceso1(3);


        //Instanciar hilos con clases que implementan Runnable:
        Proceso2 p = new Proceso2();
        Thread hilo3 = new Thread(p);  //Practicamente se lee: Utilizar la clase Thread pero lo que se debe ejecutar esta en declaracionHilos.proceso2

        //Instanciar hilos con clase anonima:
        Runnable rn = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Proceso clase anonima");
                }
            }
        };
        Thread hilo4 = new Thread(rn);  //Es practimente como se instancia el hilo3 pero sin nececitar crear una clase que implemente Runnable


        //Se debe utilizar .start() para arrancar los hilos:
        hilo1.start();
        hilo3.start();
        hilo2.start();
        hilo4.start();
    }
}
