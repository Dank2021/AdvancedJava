package estadosHilos;

public class hilo_proceso extends Thread{

    private boolean running = true;
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i+"");
        }
    }
    public void stopThread(){
        running = false;
    }

}
