
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int num=sc.nextInt(),sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            System.out.println(num+" is a Friendly Number...");
        }
        else{
            System.out.println(num+" is Not a Friendly Number...");
        }
        sc.close();
    }
}