import java.util.*;

public class permutation{
    static void swap(StringBuffer str,int a,int b){
        char ch=str.charAt(a);
        str.setCharAt(a,str.charAt(b));
        str.setCharAt(b,ch);
    }

    static void permu(StringBuffer str,int low,int high){
        if(low==high){
            System.out.println(str);
            return;
        }
        for(int i=low;i<=high;i++){
            swap(str,low,i);
            permu(str,low+1,high);
            swap(str,low,i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str=sc.nextLine();
        StringBuffer s=new StringBuffer(str);
        permu(s,0,str.length()-1);
    }
}