import java.util.Scanner;

public class equalsubstring {
    
    public static void find(String str) {
        int n = str.length();
        boolean found = false;
        System.out.println("Substring with equal number of 0, 1, and 2:");
        for (int i = 0; i < n; i++) {
            int count0 = 0, count1 = 0, count2 = 0;
            for (int j = i; j < n; j++) {
                char ch = str.charAt(j);
                if (ch == '0'){
                    count0++;
                }
                else if (ch == '1'){
                    count1++;
                }
                else if (ch == '2'){
                    count2++;
                }

                if (count0 == count1 && count1 == count2 && count0 != 0) {
                    found = true;
                    System.out.println(str.substring(i, j + 1));
                }
            }
        }

        if (!found) {
            System.out.println("No substring exist.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        find(input);
    }
}
