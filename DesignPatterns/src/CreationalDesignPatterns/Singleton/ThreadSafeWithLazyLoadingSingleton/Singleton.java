package CreationalDesignPatterns.Singleton.ThreadSafeWithLazyLoadingSingleton;

public class Singleton {
    private static volatile Singleton instance;
    public String value;

    private Singleton(String value) throws InterruptedException {
        Thread.sleep(1000);
        this.value = value;
    }

    public static Singleton getInstance(String value) throws InterruptedException {
        System.out.println("Singleton class thread name: " + Thread.currentThread().getName());
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton(value);
                }
            }
        }

        return instance;
    }

}
