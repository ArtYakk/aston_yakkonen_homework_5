package strategy;

public class Test {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService(new DeliveryByCar());
        deliveryService.info();
        deliveryService.makeDelivery();
        deliveryService.setDeliverStrategy(new DeliveryByCargo());
        deliveryService.makeDelivery();
        deliveryService.setDeliverStrategy(new DeliveryByAirplane());
        deliveryService.makeDelivery();
    }
}
