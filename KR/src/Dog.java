public class Dog implements Animal {
    private String name;
    private int age;
    private String species;
    public Dog(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSpecies() {
        return species;
    }
    public void makeSound() {
        System.out.println(name + " barks.");
    }
}