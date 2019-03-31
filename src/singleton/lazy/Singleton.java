package singleton.lazy;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("class init");
    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
