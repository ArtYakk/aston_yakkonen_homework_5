package decorator;

public class CondensedMilk extends Additive {
    public CondensedMilk(Porridge porridge) {
        super(porridge);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 40;
    }
}
