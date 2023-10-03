import java.util.*;

public class Main {
    public static void main(String[] args){
        Phonebook pb = new Phonebook();

        pb.add("Пупкин", "834543123");
        pb.add("Соловьев", "84543435456");
        pb.add("Соловьев", "8554522789");

        System.out.println(pb.get("Соловьев"));
    }


}
