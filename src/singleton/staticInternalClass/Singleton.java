package singleton.staticInternalClass;

public class Singleton {

    private Singleton() {
        System.out.println("Class init");
    }

    private static class SingletonInstance {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.instance;
    }
}
