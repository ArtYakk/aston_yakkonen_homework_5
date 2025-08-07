package proxy;

import proxy.data.Data;
import proxy.data.EmployeeData;

import java.util.List;

public class DataCollectorImplementation implements DataCollector{
    private final String databaseUrl;

    public DataCollectorImplementation(String databaseUrl) {
        this.databaseUrl = databaseUrl;
        collect();
    }

    @Override
    public void collect() {
        System.out.println("Подключились к " + databaseUrl + ", получаем данные");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервали во время получения данных");
        }

        System.out.println("Данные получены: ");

        List<Data> dataList = List.of(
                new EmployeeData("Алексей", "Смирнов", 32, true),
                new EmployeeData("Мария", "Иванова", 28, false),
                new EmployeeData("Игорь", "Петров", 45, true),
                new EmployeeData("Ольга", "Сидорова", 37, true),
                new EmployeeData("Дмитрий", "Кузнецов", 22, false)
        );

        dataList.forEach(Data::printData);
    }

}
