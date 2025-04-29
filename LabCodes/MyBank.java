class MyTransaction extends Thread{
    private MyBank account;
    private double amount;
    private boolean flag;
    public MyTransaction(MyBank account,double amount,boolean flag){
        this.account=account;
        this.amount=amount;
        this.flag=flag;
    }
}

class MyBank {
    private double balance;
    public MyBank(double balance){
        this.balance=balance;
    }
    public void deposite(double amount){
        if(amount<0){
            System.out.println("Amount to Deposite cannot be less than 0.");
        }
        else{
            System.out.println("Amount Deposited.");
            balance+=amount;
        }
    }
    public void withdraw(double amount){
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

class Main{
    public static void main(String[] args) {
        MyBank mb=new MyBank(1000);
        
    }
}

// class depositeThread extends Thread{
//     MyBank mb;
//     public depositeThread(MyBank mb){
//         this.mb=mb;
//     }
//     public void run(){
//         try{
            
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }

// class withdrawThread extends Thread{
//     MyBank mb;
//     public withdrawThread(MyBank mb){
//         this.mb=mb;
//     }
//     public void run(){
//         try{
            
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }