import java.util.*;

public class Arraylist {
    public void removeEvenLength(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            if (str.length() % 2 == 0) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Sarthak");
        list.add("Sidharth");
        list.add("Somesh");
        list.add("Rishav");

        Arraylist obj = new Arraylist();
        obj.removeEvenLength(list);

        System.out.println("Filtered list: " + list);
    }
}
