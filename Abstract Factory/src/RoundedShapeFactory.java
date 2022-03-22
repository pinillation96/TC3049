public class RoundedShapeFactory extends AbstractFactory{
    @Override
    Shape crateShape(String type) {
        if(type.equalsIgnoreCase("rectangle")){
            return new RoundedRectangle();
        }
        if(type.equalsIgnoreCase("square")){
            return new RoundedSquare();
        }
        return null;
    }
}
