public class Main {
    public static void main(String[] args){
        Cat cat = new Cat("Timon");
        Cat cat1 = new Cat("Alex");
        Dog dog = new Dog("Bobby");
        Dog dog1 = new Dog("Boy");
        Dog dog2 = new Dog("Python");
        System.out.println("Собак: " + Dog.countDogs);
        System.out.println("Котов: " + Cat.countCats);
        System.out.println("Животных: " + Animal.countAnimals);
//        cat.swim(20000);
//        dog.swim(9);
    }
}
