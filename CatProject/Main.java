public class Main {
    public static void main(String[] args){
        Cat[] array_cat = new Cat[5];
        array_cat[0] = new Cat("Timon", 15);
        array_cat[1] = new Cat("Alex", 21);
        array_cat[2] = new Cat("Barsik", 18);
        array_cat[3] = new Cat("Ryzhik", 50);
        array_cat[4] = new Cat("Vasya", 40);
        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < array_cat.length; i++){
            array_cat[i].eat(plate);
            System.out.print(array_cat[i].returnName()+", ");
            array_cat[i].returnSatiety();
        }
        plate.info();
        plate.addFood(50);
        plate.info();

    }
}
