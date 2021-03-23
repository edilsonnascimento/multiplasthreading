public class JoinThreadsTest {

    public static void main(String[] args) {

        System.out.println("MAIN THREAD STARTING...");

        Util util = new Util();
        util.criaThreds();

        try {
            util.mt1.getThread().join();
            System.out.println("JOIN: " + util.mt1.getThread().getName());
            util.mt2.getThread().join();
            System.out.println("JOIN: " + util.mt2.getThread().getName());
            util.mt3.getThread().join();
            System.out.println("JOIN: " + util.mt3.getThread().getName());
        } catch (InterruptedException e) {
            System.out.println("Thred interrompida!");
        }

        System.out.println("MAIN THREAD ENDING!");

    }
}
