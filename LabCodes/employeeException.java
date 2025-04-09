import java.util.*;

class exp extends RuntimeException{
    void showid(){
        System.out.println("The entered ID details does not meet the correct format...");
    }
    void showname(){
        System.out.println("The entered NAME details does not meet the correct format...");
    }
    void showdptid(){
        System.out.println("The entered Department ID details does not meet the correct format...");
    }
}

public class employeeException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int id=sc.nextInt();
        System.out.print("Enter Department ID: ");
        int dpt_id=sc.nextInt();
        try{
            if(name.charAt(0)<65 || name.charAt(0)>92){
                exp obj=new exp();
                throw obj;
            }
        }
        catch(exp e){
            e.showname();
        }
        try{
            if(id<2001 || id>5001){
                exp obj=new exp();
                throw obj;
            }
        }
        catch(exp e){
            e.showid();
        }
        try{
            if(dpt_id<1 || dpt_id>5){
                exp obj=new exp();
                throw obj;
            }
        }
        catch(exp e){
            e.showdptid();
        }
        System.out.println("Rest of the code will Execute Normally...");
    }
}
