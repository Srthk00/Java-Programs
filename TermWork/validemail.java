import java.util.Scanner;

public class validemail {
    public static boolean check(String email) {
        if (email == null){
            return false;
        }
        int atPos = email.indexOf('@');
        if (atPos <= 0){
            return false;
        }
        int lastAtPos = email.lastIndexOf('@');
        if (atPos != lastAtPos){
            return false;
        }
        int dotPos = email.indexOf('.', atPos);
        if (dotPos == -1 || dotPos == atPos + 1){
            return false;
        }
        if (email.endsWith(".")){
            return false;
        }
        if (email.contains(" ")){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email address: ");
        String email = sc.nextLine();

        if (check(email)) {
            System.out.println("Email is valid.");
        } 
        else {
            System.out.println("Email is NOT valid.");
        }
    }
}
