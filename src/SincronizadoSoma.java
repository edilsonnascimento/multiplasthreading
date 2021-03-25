public class SincronizadoSoma {

    private int sum;

    public synchronized int somaArray(int numeros[]){
        sum = 0;

        for (int i = 0; i < numeros.length; i++) {
             sum += numeros[i];
            System.out.println(Thread.currentThread().getName()
            + "Valor atual soma de numeros[" + i + "]: " + sum);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Thread interrompida!");
            }
        }
        return sum;
    }
}
