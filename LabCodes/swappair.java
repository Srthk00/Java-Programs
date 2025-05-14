import java.util.ArrayList;

public class swappair {
    public void swap(ArrayList<String> list){
        for(int i=0;i<list.size()-1;i+=2){
            String str=list.get(i);
            list.set(i,list.get(i+1));
            list.set(i+1,str);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Sarthak");
        list.add("Sidharth");
        list.add("Somesh");
        list.add("Rishav");
        list.add("Ayush");

        swappair obj=new swappair();
        obj.swap(list);
        System.out.println("Swapped List: "+list);
    }
}
