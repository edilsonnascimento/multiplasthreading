public class MultiplasThreadsTest {

    public static void main(String[] args) {

        System.out.println("INICIO DO MAIN");

        MultiplasThreads minhaThred1 = new MultiplasThreads("Minha Thred 1");
        MultiplasThreads minhaThred2 = new MultiplasThreads("Minha Thred 2");
        MultiplasThreads minhaThred3 = new MultiplasThreads("Minha Thred 3");

        for (int i = 0; i < 50; i++) {
            System.out.println("Execucao FOR INICIO: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("OUTRA thred Interrumpida!");
            }
            System.out.println("Execucao FOR FIM.\n");
        }
        System.out.println("\nFIM DO MAIN.");
    }
}
