import java.util.Scanner;

public class bank {
    private String name;
    private String accnumber;
    private String address;
    private Double balance=0.00;

    void setter(String n,String accnum,String add){
        name=n;
        accnumber=accnum;
        address=add;
    }

    void showdetails(){
        System.out.println("\nAccount Holder: " + name);
        System.out.println("Account Number: " + accnumber);
        System.out.println("Address: " + address);
        System.out.println("Account Balance: " + balance);    }

    void deposit(double amm){
        if(amm>0){
            balance+=amm;
            System.out.println("$" + amm + " deposited successfully...");
        }   
        else{
            System.out.println("Deposit amount cannot be negative...");
        }
    }

    void withdraw(double  amm){
        if(amm<0)
            System.out.println("Amount cannot be Negative...");
        else if(amm>balance){
            System.out.println("Amount cannot be more than Account Balance...");
        }
        else{
            balance-=amm;
            System.out.println(amm+" has been withdrawn...\nNew Balance: "+balance);
        }
    }

    public static void main(String[] args) {
        int acno=1000;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Depositors: ");
        int n=sc.nextInt();
        bank bk[]=new bank[n];
        for(int i=0;i<n;i++){
            bk[i]=new bank();
        }
        int count=0;
        while(true){
            int choice;
            System.out.print("\n0. Create Account\n1. Show Details\n2. Deposit\n3. WithDraw\n4. Exit\nEnter your Choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 0:{
                    if(count<n){
                        System.out.print("Enter Name: ");
                        String name=sc.nextLine();
                        System.out.print("Enter Address: ");
                        String address=sc.nextLine();
                        acno+=1;
                        String accNumber="ACC"+acno;
                        bk[count].setter(name,accNumber,address);
                        System.out.println("Account created successfully! Account Number: " + accNumber);
                        count++;
                    }
                    else{
                        System.out.println("Maximum number of accounts reached.");
                    }
                    break;
                }
                case 1:{
                    System.out.print("Enter Account Number: ");
                    String search=sc.nextLine();
                    boolean found=false;
                    for(int i=0;i<count;i++){
                        if(bk[i].accnumber.equals(search)){
                            bk[i].showdetails();
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Account not found!");
                    }
                    break;
                }
                case 2:{
                    System.out.print("Enter Account Number: ");
                    String search=sc.nextLine();
                    boolean found=false;
                    for(int i=0;i<count;i++){
                        if(bk[i].accnumber.equals(search)){
                            System.out.print("Enter Amount to Deposit: ");
                            double val=sc.nextDouble();
                            bk[i].deposit(val);
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Account not found!");
                    }
                    break;
                }
                case 3:{
                    System.out.print("Enter Account Number: ");
                    String search=sc.nextLine();
                    boolean found=false;
                    for(int i=0;i<count;i++){
                        if(bk[i].accnumber.equals(search)) {
                            System.out.print("Enter Amount to Withdraw: ");
                            double val=sc.nextDouble();
                            bk[i].withdraw(val);
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Account not found!");
                    }
                    break;
                }
                case 4:{
                    System.out.print("Program Ended...");
                    sc.close();
                    return;
                }
                default:{
                    System.out.println("Invlaid Choice...");
                }
            }
        }
    }
}