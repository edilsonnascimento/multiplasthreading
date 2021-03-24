import javafx.scene.layout.Priority;

public class PrioridadeTest {

    public static void main(String[] args) {

        System.out.println("MAIN INICIADO...");

        Prioridade mt1 = new Prioridade("Prioridade Alta");
        Prioridade mt2 = new Prioridade("Baixa Prioridade");

        //define as prioridades
        mt1.thread.setPriority(Thread.NORM_PRIORITY + 2);
        mt2.thread.setPriority(Thread.NORM_PRIORITY - 2);

        mt1.thread.start();
        mt2.thread.start();

        try {
            mt1.thread.join();
            mt2.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Thred interrompida!");
        }

        System.out.println("\n Contagem da Thred com Alta prioridade: " + mt1.count);
        System.out.println("\n Contagem da Thred com Baixa prioridade: " + mt2.count);
        System.out.println("MAIN TERMINADO!");



    }
}
