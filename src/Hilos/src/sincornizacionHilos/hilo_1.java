package sincornizacionHilos;

public class hilo_1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print("J");
            try {
                hilo_1.sleep(1000);
            }catch (InterruptedException w){}

        }

    }
}
