import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int temp=num,pv=0;
        while(temp!=0){
            if(temp%10==0)
                num=num+(int)Math.pow(10,pv);
            pv++;
            temp=temp/10;
        }
        System.out.println("Updated Number: "+num);
        sc.close();
    }
}