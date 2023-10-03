public class Cat extends Animal {
    static int countCats = 0;
    {
        countCats += 1;
    }
    public Cat(String name){
        this.name = name;
    }
    public void catlInfo() {
        System.out.println("Кот: " + name);
    }
    public void run(int distance) {
        if (distance <= 200){
            System.out.println(name + " пробежал: " + distance + "м");
        }else {
            System.out.println(name + " не может пробежать такое расстояние");
        }

    }

    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }
}
