import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Binary String: ");
        String str=sc.nextLine();
        int count=0;
        int i=0,left,right=0;
        while(i<str.length()){
            if(str.charAt(i)=='0'){
                left=i;
                i++;
                while(i<str.length() && str.charAt(i)=='1'){ 
                    i++;
                }
                if(i<str.length() && str.charAt(i)=='0'){
                    right=i;
                    count++;
                    System.out.println(str.substring(left,right+1));
                    i=left+1;
                }
            }
            i++;
        }
        System.out.println("Patterns found: "+count);
        sc.close();
    }
}