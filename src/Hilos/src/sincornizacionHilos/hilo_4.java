package sincornizacionHilos;

public class hilo_4 extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("N");
            try {
                hilo_1.sleep(1000);
            }catch (InterruptedException w){}

        }

    }
}
