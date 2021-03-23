public class MyThread implements Runnable{

    private Thread thread;


    public MyThread(String threadName) {
        this.thread = new Thread(this, threadName);
        System.out.println("Criada a thred: " + thread.getName());
        thread.start();
    }


    @Override
    public void run() {
        System.out.println(this.thread.getName() + " RUN...");
        try {
            for (int i = 0; i < 18; i++){
                Thread.sleep(300);
                System.out.println(this.thread.getName() + " i: " + i);
            }

        }catch (InterruptedException e){
            System.out.println(this.thread.getName() + " interrupted!");

        }
    }

    public Thread getThread() {
        return thread;
    }
}
