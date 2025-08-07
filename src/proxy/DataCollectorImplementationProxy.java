package proxy;

public class DataCollectorImplementationProxy implements DataCollector{
    private final String databaseUrl;
    private DataCollector dataCollector;

    public DataCollectorImplementationProxy(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    @Override
    public void collect() {
        if(dataCollector == null){
            dataCollector = new DataCollectorImplementation(databaseUrl);
        }
    }

}
