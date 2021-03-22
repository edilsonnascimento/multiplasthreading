public class IsAliveTest {

    public static void main(String[] args) {
        System.out.println("MAIN THREAD STARTING...");

        MyThread mt1 = new MyThread("Minha Thred 1");
        MyThread mt2 = new MyThread("Minha Thred 2");
        MyThread mt3 = new MyThread("Minha Thred 3");

        do{
            System.out.println(".....sleep....");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted!");
            }
        }while (mt1.getThread().isAlive() ||
                mt2.getThread().isAlive() ||
                mt3.getThread().isAlive());

        System.out.println("MAIN THREAD ENDING.");
    }
}
