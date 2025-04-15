
import java.io.*;
import java.util.Scanner;

class countpalindrome{
    static boolean check(String str){
        if(str==null || str.isEmpty())
            return false;
        String word=str.toLowerCase();
        int i=0,j=word.length()-1;
        while(i<j){
            if(word.charAt(i)!=word.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }

    public static void main(String[] args) throws Exception{
        int count=0;
        Scanner sc=new Scanner(new File("sample.txt"));
        while(sc.hasNext()){ 
            String str=sc.next();
            if(check(str)){
                count++;
                System.out.println(str); 
            }
        }
        System.out.println("Total number of Palindrome words in File: "+count);
    }
}