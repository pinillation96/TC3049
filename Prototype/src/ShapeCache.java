import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String,Shape> shapeCache= new Hashtable<>();

    public static Shape getShape(String shapeId){
        Shape cachedShape= shapeCache.get(shapeId);
        return (Shape)cachedShape.clone();
    }
    public static void loadCache(){
        Circle c1= new Circle();
        c1.setId("1");
        shapeCache.put(c1.getId(),c1);

        Rectangle r1= new Rectangle();
        r1.setId("2");
        shapeCache.put(r1.getId(),r1);
    }

}
