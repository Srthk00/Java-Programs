import java.util.Scanner;

public class ipv4 {

    public static boolean check(String ip) {
        String[] parts = ip.split("\\.");
        if (parts.length != 4){
            return false;
        }
        for (String part : parts) {
            if (part.length() > 1 && part.startsWith("0")) {
                return false;
            }
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an IPv4 address:");
        String ip = sc.nextLine();
        if(check(ip)) {
            System.out.println("Valid IPv4 address.");
        } 
        else {
            System.out.println("Invalid IPv4 address.");
        }
    }
}
