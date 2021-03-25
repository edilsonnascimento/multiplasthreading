public class SincronizadoThreadTest {

    public static void main(String[] args) {

        int arrayNumeros[] = {1, 2, 3, 4, 5};

        System.out.println("INICIA MAIN");

        SincronizadoThread tread1 = new SincronizadoThread("Tread 1: ", arrayNumeros);
        SincronizadoThread tread2 = new SincronizadoThread("Tread 2: ", arrayNumeros);

        try {
            tread1.thread.join();
            tread2.thread.join();
        } catch (InterruptedException e) {
            System.out.println("MAIN INTERROMPIDO!");
        }
        System.out.println("TERMINA MAIN");
    }
}
