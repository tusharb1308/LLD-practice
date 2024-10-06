package CreationalDesignPatterns.Singleton.MultiThreadedSingleton;

public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value){
        System.out.println("Singleton class thread name: " + Thread.currentThread().getName());
        if(instance == null){
            instance = new Singleton(value);
        }

        return instance;
    }

}
