package sincornizacionHilos;

public class hilo_3 extends Thread{

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.print("A");
            try {
                hilo_1.sleep(1000);
            }catch (InterruptedException w){}
        }

    }
}
