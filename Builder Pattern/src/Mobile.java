public abstract class Mobile implements Item{

    public abstract String getName();

    @Override
    public Box getBox() {
        return new SmallBox();
    }
    public abstract double getPrice();
}
