package strategy;

public class DeliveryByCargo implements DeliverStrategy {
    @Override
    public void deliver() {
        System.out.println("Доставляем на грузовом корабле");
    }
}
