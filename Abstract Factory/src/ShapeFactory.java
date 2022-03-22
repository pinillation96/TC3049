public class ShapeFactory extends AbstractFactory {
    @Override
    Shape crateShape(String type) {
        if(type.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        if(type.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }
}
