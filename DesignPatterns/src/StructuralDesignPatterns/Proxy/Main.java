package StructuralDesignPatterns.Proxy;

public class Main {
    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("test.png");

        //image will be loaded from disk
        proxyImage.display();
        System.out.println("===============");

        //image will not be loaded from disk
        proxyImage.display();
    }
}
