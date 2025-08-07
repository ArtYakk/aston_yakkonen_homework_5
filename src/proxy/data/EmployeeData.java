package proxy.data;

public record EmployeeData(String name, String surname, int age, boolean lookingForANewJob) implements Data {
    @Override
    public void printData() {
        System.out.println(this);
    }
}
