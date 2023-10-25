import java.util.ArrayList;
import java.util.List;
public class Shelter {
    private List<Animal> animals;
    private List<Employee> employees;
    public Shelter() {
        animals = new ArrayList<>();
        employees = new ArrayList<>();
    }
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public List<Animal> getAnimal(){
        return animals;
    }
    public  List<Employee> getEmployees(){
        return employees;
    }
    public void listAnimals() {
        System.out.println("Animals in the shelter:");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " - " + animal.getSpecies());
        }
    }

    public void listEmployees() {
        System.out.println("Employees of the shelter:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - " + employee.getPosition());
        }
    }
}