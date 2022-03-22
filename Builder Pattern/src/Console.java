public abstract class Console implements Item {
    public abstract String getName();

    @Override
    public Box getBox() {
        return new BigBox();
    }

    public abstract double getPrice();
}
