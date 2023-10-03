public class Dog extends Animal {
    static int countDogs = 0;
    {
        countDogs += 1;
    }
    public Dog(String name){
        this.name = name;
    }
    public void doglInfo() {
        System.out.println("Собака: " + name);
    }
    public void run(int distance) {
        if (distance <= 500){
            System.out.println(name + " пробежал: " + distance + "м");
        }else {
            System.out.println(name + " не может пробежать такое расстояние");
        }

    }

    public void swim(int distance) {
        if (distance <= 10 ){
            System.out.println(name + " проплыл: " + distance + "м");
        }else {
            System.out.println(name + " не может проплыть такое расстояние");
        }

    }
}
