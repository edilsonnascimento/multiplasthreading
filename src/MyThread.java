public class MyThread implements Runnable{

    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }


    @Override
    public void run() {
        System.out.println(this.threadName + " Startinng...");
        try {
            for (int i = 0; i < 10; i++){
                Thread.sleep(400);
                System.out.println("In " + threadName + " i: " + i);
            }

        }catch (InterruptedException e){
            System.out.println(this.threadName + " interrupted!");

        }
    }
}
