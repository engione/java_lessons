public class Animal {
    String name;
    static int countAnimals = 0;
    {
        countAnimals += 1;
    }

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное: " + name);
    }

    public void run() {
        System.out.println(name + " побежал");
    }
    public void swim() {

        System.out.println(name + " поплыл");
    }
}

