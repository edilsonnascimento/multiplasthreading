public class MultiplasThreads implements Runnable{

    private Thread myThread;

    public MultiplasThreads(String nomeThread) {
        this.myThread = new Thread(this, nomeThread);
        myThread.start();
    }

    @Override
    public void run() {
        System.out.println("INICIA " + this.myThread.getName());
        for(int i=0; i < 18; i++){
            try {
                Thread.sleep(400);
                System.out.println("EXECUCAO: " + myThread.getName() + " i: " + i);
            } catch (InterruptedException e) {
                System.out.println(myThread.getName() + " Interrumpida!");
            }
        }

        System.out.println(myThread.getName() + " Terminada.");

    }
}
