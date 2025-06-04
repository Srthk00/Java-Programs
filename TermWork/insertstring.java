
import java.util.Scanner;

public class insertstring{
    public static String insert(String s1, String s2, int index){
        char[] str1=s1.toCharArray();
        char[] str2=s2.toCharArray();
        char[] result=new char[str1.length+str2.length];
        int i=0,j=0;
        while(i<index){
            result[j++]=str1[i++];
        }
        for(char c:str2){
            result[j++]=c;
        }
        while(i<str1.length){
            result[j++]=str1[i++];
        }
        String newstr= "";
        for(char c:result){
            newstr+=c;
        }
        return newstr;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String s1=sc.nextLine();
        System.out.println("Enter String 2: ");
        String s2=sc.nextLine();
        System.out.println("Enter Index where to enter: ");
        int index=sc.nextInt();
        String result=insert(s1,s2,index);
        System.out.println("Result: " + result);
    }
}
