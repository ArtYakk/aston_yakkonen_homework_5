package strategy;

public class DeliveryByAirplane implements DeliverStrategy {
    @Override
    public void deliver() {
        System.out.println("Доставляем самолетом");
    }
}
