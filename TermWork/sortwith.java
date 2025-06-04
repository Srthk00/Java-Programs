import java.util.Arrays;
import java.util.Scanner;

public class sortwith {
    public static String sortString(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to sort: ");
        String input = sc.nextLine();
        String sorted = sortString(input);
        System.out.println("Sorted string: " + sorted);
    }
}
