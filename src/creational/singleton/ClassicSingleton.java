package creational.singleton;

public class ClassicSingleton {
    private static ClassicSingleton uniqueInstance;

    // other instance variable

    private ClassicSingleton() {};

    public static ClassicSingleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new ClassicSingleton();
        }
        return uniqueInstance;
    }

    // other method
}
