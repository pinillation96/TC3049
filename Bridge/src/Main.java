public class Main {
    public static void main(String[] args) {
        Shape circleRed= new Circle(100,100,100,new RedCircle());
        Shape greenCircle= new Circle(100,100,100,new GreenCircle());

        circleRed.draw();
        greenCircle.draw();

    }
}
