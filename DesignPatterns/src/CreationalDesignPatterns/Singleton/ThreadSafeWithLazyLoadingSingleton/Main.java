package CreationalDesignPatterns.Singleton.ThreadSafeWithLazyLoadingSingleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main class thread name: " + Thread.currentThread().getName());
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        Thread fooThread = new Thread(new ThreadFoo(), "fooThread");
        Thread barThread = new Thread(new ThreadBar(), "barThread");

        fooThread.start();
        barThread.start();
    }

    static class ThreadFoo implements Runnable{

        @Override
        public void run() {
            try {
                Singleton singleton = Singleton.getInstance("Foo");
                System.out.println(singleton.value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class ThreadBar implements Runnable{

        @Override
        public void run(){
            try {
                Singleton singleton = Singleton.getInstance("Bar");
                System.out.println(singleton.value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
