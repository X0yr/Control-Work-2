import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter();
        shelter.addAnimal(new Cat("Барсик", 2, "Кот"));
        shelter.addAnimal(new Dog("Шарик", 5, "Пёс"));

        shelter.addEmployee(new ShelterEmployee("Екатерина", "Уборщица"));
        shelter.addEmployee(new ShelterEmployee("Виктор", "Ветеринар"));

        List<Animal> animalList = shelter.getAnimal();
        List<Employee> employeeList = shelter.getEmployees();

        System.out.println("Список животных в приюте: ");
        for(Animal animal : animalList){
            System.out.println("Кличка: " + animal.getName() + ", Возраст: " + animal.getAge() + ", Вид: " + animal.getSpecies());
        }

        System.out.println("\nСписок сотрудников приюта: ");
        for(Employee employee : employeeList){
            System.out.println("Имя: " + employee.getName() + ", Должность: " + employee.getPosition());
        }
    }
}