package singleton.hungry;

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("class init");
    }

    public static Singleton getInstance() {
        return instance;
    }
}
