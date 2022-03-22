public class Main {

    public static void main(String[] args) {
        AbstractFactory shapeFactory= FactoryProducer.getFactory(false);
        Shape s1=shapeFactory.crateShape("square");
        s1.draw();
    }
}
