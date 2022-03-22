public class Circle extends Figura{

    private int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Circle(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {

        return 3.14*(radio*radio);
    }
}
