public class SustencaoThread implements  Runnable{

    Thread thread;
    boolean suspended;
    boolean stop;

    public SustencaoThread(String nomeThread) {
        thread = new Thread(this, nomeThread);
        suspended = false;
        stop = false;
        thread.start();
    }

    @Override
    public void run() {

        System.out.println(thread.getName() + " starting...");
        try {
            for (int i = 0; i < 1000; i++) {
                if( (i % 10) == 0){
                    System.out.println(i);
                    Thread.sleep(250);
                }
                synchronized (this){
                    while (suspended){
                        wait();
                    }
                    if(stop) break;
                }
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " Interrompida!");
        }
        System.out.println(thread.getName() + " Exiting...");
    }

    synchronized void myStop(){
        stop = true;
        //assegura que uma thread suspensa possa ser encerrada.
        suspended = false;
        notify();
    }

    synchronized void mySuspend(){
        suspended = true;
    }

    synchronized void myResume(){
        suspended = false;
        notify();
    }
}
