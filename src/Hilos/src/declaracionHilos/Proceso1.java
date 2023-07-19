package declaracionHilos;

//Para trabajar con hilos en este caso utilizamos extends Thread
public class Proceso1 extends Thread{

    private int n;
    public Proceso1(String NombreHilo){ //Con este contructor podemos modificar el metodo getName(). Dandole un nombre personalizado al hilo.
        super(NombreHilo);
        this.n = 1;
    }

    public Proceso1(int n){

        this.n = n;    //Con el this se hace referencia a la variable global n.
    }

    //Se debe hacer uso del metodo run()
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Proceso "+n+" "+this.getName());
        }
    }

}
