public class ShapeFactory {

    public Shape createShape(String type){
        if(type==null){
            return null;
        }
        if(type.equalsIgnoreCase("circle")){
            return new Circle();
        }
        if(type.equalsIgnoreCase("triangle")){
            return new Triangle();
        }
        if(type.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
