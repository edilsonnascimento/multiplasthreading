public class Util {

    public MyThread mt1;
    public MyThread mt2;
    public MyThread mt3;


    public void criaThreds(){
        mt1 = new MyThread("Minha Thred 1");
        mt2 = new MyThread("Minha Thred 2");
        mt3 = new MyThread("Minha Thred 3");
    }
}
