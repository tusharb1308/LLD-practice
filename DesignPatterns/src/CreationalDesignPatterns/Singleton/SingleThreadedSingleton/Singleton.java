package CreationalDesignPatterns.Singleton.SingleThreadedSingleton;

public final class Singleton {

    private static Singleton instance;
    public String value;

    private Singleton(String value) throws InterruptedException {
        Thread.sleep(1000);  // for gap between two executions
        this.value = value;
    }

    public static Singleton getInstance(String value) throws InterruptedException {
        if(instance == null){
            instance = new Singleton(value);
        }

        return instance;
    }
}
