package adapter;

public class Test {
    public static void main(String[] args) {
        IntegerSupplier integerSupplier = new IntegerSupplier();
//        clientMessageHandle(integerSupplier.supply()); // Никак
        ClientInterface clientInterface = new IntegerToStringAdapter(integerSupplier);

        for (int i = 0; i < 10; i++) {
            clientMessageHandle(clientInterface.getMessage());
        }
    }

    public static void clientMessageHandle(String message){
        System.out.println("Получено сообщение: " + message);
    }
}
