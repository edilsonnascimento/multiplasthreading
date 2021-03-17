public class MyThreadTest {

    public static void main(String[] args) {

        System.out.println("INICIO DO MAIN...\n");

        //Primeiro, controi um objeto MyThread
        MyThread myThread = new MyThread("MINHA thread");

        //outro processo em execução
        for (int i = 0; i < 50; i++){
            System.out.println("OUTRA thread i: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main threadd interrupted...");
            }
            System.out.println("FIM da OUTRA Thread.");
        }
        System.out.println("FIM DO MAIN.");
    }
}
