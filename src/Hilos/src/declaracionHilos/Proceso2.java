package declaracionHilos;

//Para trabajar con hilos en este caso utilizamos implements Runnable
public class Proceso2 implements Runnable{

    //Se debe hacer uso del metodo run()
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Proceso 2");    //No se puede utilizar el getName() aca puesto que solo es al usar extends Thread.
        }
    }
}
