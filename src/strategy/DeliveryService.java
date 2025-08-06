package strategy;

public class DeliveryService {
    private DeliverStrategy deliverStrategy;

    public DeliveryService(DeliverStrategy deliverStrategy) {
        this.deliverStrategy = deliverStrategy;
    }

    public void setDeliverStrategy(DeliverStrategy deliverStrategy) {
        this.deliverStrategy = deliverStrategy;
    }

    public void makeDelivery(){
        deliverStrategy.deliver();
    }

    public void info(){
        System.out.println(
                """
                Добро пожаловать в нашу службу доставки! 
                Рады сообщить вам, что в нашем арсенале
                целых 3 способа доставки, вам доступны такие 
                варианты, как: самолет, корабль, авто
                """
        );
    }
}
