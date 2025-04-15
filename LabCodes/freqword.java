import java.io.*;
import java.util.*;

class freqword {
    public static void main(String[] args) throws Exception{
        int count=0;
        Scanner sc=new Scanner(new File("sample.txt"));
        System.out.print("Enter word to search: ");
        Scanner scc=new Scanner(System.in);
        String target=scc.nextLine();
        while(sc.hasNext()){ 
            String str=sc.next();
            if(str.equals(target)){
                count++;
            }
        }
        if(count==0){
            System.out.println("The word '"+target+"' does not exist...");
        }
        else{
            System.out.println("The word '"+target+"' occurs: "+count+" times...");
        }
    }
}