public class SincronizadoThread implements Runnable{

    Thread thread;
    static SincronizadoSoma soma;
    int array[];
    int retorno;

    public SincronizadoThread(String nomeThrea, int[] array) {
        this.array = array;
        soma = new SincronizadoSoma();
        thread = new Thread(this, nomeThrea);
        thread.start();
    }

    @Override
    public void run() {

        System.out.println(thread.getName() + "iniciada....");
        retorno = soma.somaArray(array);
        System.out.println("Soma para " + thread.getName() + " is: " + retorno);
        System.out.println(thread.getName() + "finalizada!");
    }
}