import java.util.*;

class MyTransaction extends Thread{
    private MyBank account;
    private double amount;
    private boolean flag;
    public MyTransaction(MyBank account,double amount,boolean flag){
        this.account=account;
        this.amount=amount;
        this.flag=flag;
    }
    public void run(){
        if(flag==true){
            account.deposite(amount);
        }
        else{
            account.withdraw(amount);
        }
    }
}

class MyBank {
    private double balance;
    public MyBank(double balance){
        this.balance=balance;
    }
    public synchronized void deposite(double amount){
        if(amount<0){
            System.out.println("Amount to Deposite cannot be less than 0.");
        }
        else{
            System.out.println("Amount Deposited.");
            balance+=amount;
        }
    }
    public synchronized void withdraw(double amount){
        if(amount<0){
            System.out.println("Amount less than 0 cannot be withdrawn.");
        }
        else if(amount>balance){
            System.out.println("Cannot withdraw amount more than Balance.");
        }
        else{
            System.out.println("Amount Withdrawl.");
            balance-=amount;
        }
    }
    public double getBalance(){
        return balance;
    }
}

public class BankThread{
    public static void main(String[] args) throws InterruptedException{
        Scanner sc=new Scanner(System.in);
        MyBank mb=new MyBank(1000);
        for(int i=0;i<5;i++){
            System.out.print("Enter amount to withdraw: ");
            double with=sc.nextDouble();
            System.out.print("Enter amount to Deposit: ");
            double depo=sc.nextDouble();
            MyTransaction depositeThread=new MyTransaction(mb,depo,true);
            MyTransaction withdrawThread=new MyTransaction(mb,depo,false);
            depositeThread.start();
            withdrawThread.start();
            try{
                depositeThread.join();
                withdrawThread.join();
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Balance after: "+(i+1)+"="+mb.getBalance());
        }
    }
}