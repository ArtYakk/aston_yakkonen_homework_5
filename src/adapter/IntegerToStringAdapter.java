package adapter;

public class IntegerToStringAdapter implements ClientInterface{
    private final IntegerSupplier integerSupplier;

    public IntegerToStringAdapter(IntegerSupplier integerSupplier) {
        this.integerSupplier = integerSupplier;
    }

    @Override
    public String getMessage() {
        return String.valueOf(integerSupplier.supply());
    }
}
