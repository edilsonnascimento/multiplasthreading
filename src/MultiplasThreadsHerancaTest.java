public class MultiplasThreadsHerancaTest {

    public static void main(String[] args) {

        System.out.println("INICIO DO MAIN");

        MultiplasThreadsHeranca thred1 = new MultiplasThreadsHeranca("Thred 1");
        MultiplasThreadsHeranca thred2 = new MultiplasThreadsHeranca("Thred 2");
        MultiplasThreadsHeranca thred3 = new MultiplasThreadsHeranca("Thred 3");

        for (int i = 0; i < 50; i++) {
            System.out.println("INICIO FOR do MAIN: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("OUTRA thred Interrumpida!");
            }
            System.out.println("FIM FOR do MAIN: " + i + "\n");
        }
        System.out.println("\nFIM DO MAIN.");
    }
}
