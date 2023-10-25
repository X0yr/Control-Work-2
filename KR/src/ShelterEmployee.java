public class ShelterEmployee implements Employee {
    private String name;
    private String position;
    public ShelterEmployee(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public void doWork() {
        System.out.println(name + " is taking care of the animals.");
    }
}
