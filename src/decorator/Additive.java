package decorator;

public abstract class Additive implements Porridge {
    private final Porridge porridge;

    public Additive(Porridge porridge) {
        this.porridge = porridge;
    }

    @Override
    public int getPrice() {
        return porridge.getPrice();
    }
}
