public class Main {

    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedShape1= (Shape)ShapeCache.getShape("1");
        System.out.println("Shape: "+clonedShape1.getType());
    }
}
