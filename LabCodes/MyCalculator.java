import java.util.*;

class exp extends RuntimeException{
    exp(String str){
        super(str);
    }
}

public class MyCalculator {

    static double power(int n,int p){
        return Math.pow(n,p);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n=sc.nextInt();
        System.out.print("Enter value of p: ");
        int p=sc.nextInt();
        try{
            if(n<0 || p<0){
                exp obj=new exp("Value of 'n' or 'p' cannot be Negative...");
                throw obj;
            }
            if(n==0 || p==0){
                exp obj=new exp("Value of 'n' or 'p' cannot be Zero...");
                throw obj;
            }
            System.out.println(power(n,p));
        }
        catch(exp e){
            System.out.println(e.getMessage());
        }
        System.out.println("Rest of the Code will execute normally...");
    }
}