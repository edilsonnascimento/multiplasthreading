public class ComunicacaoThreads implements Runnable{

    Thread thread;
    ComunicacaoClasseSincronizada tickTock;

    public ComunicacaoThreads(String nomeThread, ComunicacaoClasseSincronizada tickTock) {
        thread = new Thread(this, nomeThread);
        this.tickTock = tickTock;
        thread.start();
    }

    @Override
    public void run() {

        if(thread.getName().compareTo("Tick") == 0){
            for (int i = 0; i < 5; i++) tickTock.tick(true);
            tickTock.tick(false);
        }else{
            for (int i = 0; i < 5; i++) tickTock.tock(true);
            tickTock.tock(false);
        }
    }

}

