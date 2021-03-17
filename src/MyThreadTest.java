public class MyThreadTest {

    public static void main(String[] args) {

        System.out.println("Main thread starting...");

        //Primeiro, controi um objeto MyThread
        MyThread myThread = new MyThread("My Thread process");

        //Em seguida, controi uma thread a partir desse objeto
        Thread newThread = new Thread(myThread);

        //Executa a myThread
        newThread.start();

        //outro processo em execução
        for (int i = 0; i < 50; i++){
            System.out.println("In execution i: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main threadd interrupted...");
            }
        }
    }
}
