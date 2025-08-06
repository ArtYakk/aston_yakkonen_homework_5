package strategy;

public class DeliveryByCar implements DeliverStrategy {
    @Override
    public void deliver() {
        System.out.println("Доставляем на машине");
    }
}
