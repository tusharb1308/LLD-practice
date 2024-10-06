package CreationalDesignPatterns.Singleton.SingleThreadedSingleton;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        Singleton instance1 = Singleton.getInstance("Foo");
        Singleton instance2 = Singleton.getInstance("Bar");

        System.out.println(instance1.value);
        System.out.println(instance2.value);
    }
}
