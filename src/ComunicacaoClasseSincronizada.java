
public class ComunicacaoClasseSincronizada {

    String state; //contém o estado do relógio

    synchronized void tick(boolean running) {
        if (!running) { //interrompe o relógio
            state = "ticked";
            notify(); //notifica qualquer thread que estiver esperando
            return;
        }
        System.out.println("Tick ");

        state = "ticked"; //difine o estado atual com ticked

        notify(); //permite que tock seja executado
        try {
            while (!state.equals("tocked"))
                wait(); //espera tock() terminar
        } catch (InterruptedException e) {
            System.out.println("Thtead interrompida!");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) { //interrompe o relógio
            state = "tocked";
            notify(); //notifica qualquer thread que estiver esperando
            return;
        }

        System.out.println("Tock ");

        state = "tocked"; //difine o estado atual com tocked

        notify(); //permite que tick seja executado
        try {
            while (!state.equals("ticked"))
                wait(); //espera tick() terminar
        } catch (InterruptedException e) {
            System.out.println("Thtead interrompida!");
        }
    }

}
