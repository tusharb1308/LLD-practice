package StructuralDesignPatterns.Flyweight;

public class Main {
    private static final String[] colors = {"Red", "Green", "Blue", "Black", "White"};

    private static int getRandomX(){
        return (int) (Math.random()*100);
    }

    private static int getRandomY(){
        return (int) (Math.random()*100);
    }

    private static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }

    public static void main(String[] args) {
        for(int i=0; i<20; i++){
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }
}
