package decorator;

public class Berries extends Additive {
    public Berries(Porridge porridge) {
        super(porridge);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 15;
    }
}


