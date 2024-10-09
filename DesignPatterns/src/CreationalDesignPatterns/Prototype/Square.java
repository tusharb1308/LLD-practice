package CreationalDesignPatterns.Prototype;

public class Square extends Shape {

    Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Draw Square");
    }
}
