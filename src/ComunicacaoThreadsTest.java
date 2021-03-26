public class ComunicacaoThreadsTest {

    public static void main(String[] args) {

        ComunicacaoClasseSincronizada tickTock = new ComunicacaoClasseSincronizada();
        ComunicacaoThreads thead1 = new ComunicacaoThreads("Tick", tickTock);
        ComunicacaoThreads thead2 = new ComunicacaoThreads("Tock", tickTock);

        try {
            thead1.thread.join();
            thead2.thread.join();
        } catch (InterruptedException e) {
            System.out.println("erro");
        }

    }
}
