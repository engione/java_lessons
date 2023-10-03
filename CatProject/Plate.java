public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if (food - n >= 0){
            food -= n;
            return true;
        }else{
            return false;
        }

    }
    public void addFood(int add){
        food += add;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}
