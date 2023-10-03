public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        if (p.decreaseFood(appetite)){
            satiety = true;
        } else {
            satiety = false;
        }
    }
    public String returnName(){
        return name;
    }
    public void returnSatiety() {
        System.out.println("сытость = " + satiety);
    }
}
