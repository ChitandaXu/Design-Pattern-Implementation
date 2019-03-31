package singleton.test;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        Thread t3 = new Thread(new MyThread());

        t1.start();
        t2.start();
        t3.start();
    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        singleton.DoubleCheckLock.Singleton instance1 = singleton.DoubleCheckLock.Singleton.getInstance();
        singleton.DoubleCheckLock.Singleton instance2 = singleton.DoubleCheckLock.Singleton.getInstance();
        singleton.DoubleCheckLock.Singleton instance3 = singleton.DoubleCheckLock.Singleton.getInstance();
    }
}
