package decorator;

public class Chocolate extends Additive{
    public Chocolate(Porridge porridge) {
        super(porridge);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 100;
    }
}
