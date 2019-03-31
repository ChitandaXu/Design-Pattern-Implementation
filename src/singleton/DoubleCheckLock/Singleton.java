package singleton.DoubleCheckLock;

public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {
        System.out.println("class init");
    }

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();
    }
}
