package proxy;

public class Test {
    public static void main(String[] args) {
//        DataCollector dataCollector = new DataCollectorImplementation("jdbc:postgres://localhost:5432/employees");
        DataCollectorImplementationProxy dataCollectorImplementationProxy =
                new DataCollectorImplementationProxy("jdbc:postgres://localhost:5432/employees");

        dataCollectorImplementationProxy.collect();

    }
}
