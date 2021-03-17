public class MultiplasThreadsHeranca extends Thread{

    public MultiplasThreadsHeranca(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println("INICIA RUN " + getName());
        for(int i=0; i < 18; i++){
            try {
                Thread.sleep(400);
                System.out.println("EXECUCAO: " + getName() + " i: " + i);
            } catch (InterruptedException e) {
                System.out.println(getName() + " Interrumpida!");
            }
        }

        System.out.println("FINALIZA RUN " + getName());

    }
}
