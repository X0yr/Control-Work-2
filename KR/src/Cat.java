public class Cat implements Animal {
    private String name;
    private int age;
    private String species;
    public Cat(String name, int age, String species) {
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
        System.out.println(name + " meows.");
    }
}
