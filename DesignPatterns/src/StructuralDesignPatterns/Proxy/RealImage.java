package StructuralDesignPatterns.Proxy;

public class RealImage implements Image {

    private final String fileName;

    RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }

    public void loadFromDisk(String fileName){
        System.out.println("Loading from disk: " + fileName);
    }
}
