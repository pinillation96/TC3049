

public class Main {
    public static void main (String args[]){
        ShapeFactory shapeFactory= new ShapeFactory();
        Shape s1= shapeFactory.createShape("circle");
        s1.draw();

    }
}

