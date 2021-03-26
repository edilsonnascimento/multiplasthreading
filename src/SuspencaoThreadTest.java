import java.util.TreeMap;

public class SuspencaoThreadTest {

    public static void main(String[] args) {

        SustencaoThread objeto = new SustencaoThread("Minha Thread");

        try {
            Thread.sleep(1000); //permite que a ob1 seja executado.

            objeto.mySuspend();
            System.out.println("Suspendendo thread: " + objeto.thread.getName());
            Thread.sleep(1000);

            objeto.myResume();
            System.out.println("Retomando thread: " + objeto.thread.getName());
            Thread.sleep(1000);

            objeto.mySuspend();
            System.out.println("Suspendendo thread: " + objeto.thread.getName());
            Thread.sleep(1000);

            objeto.mySuspend();
            System.out.println("Parando thread: " + objeto.thread.getName());
            objeto.myStop();

        } catch (InterruptedException e) {
            System.out.println("Thread Main interrompida!");
        }

        System.out.println("Main finalizada.");

    }

}
