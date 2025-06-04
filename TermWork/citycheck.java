import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class citycheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        Pattern pattern = Pattern.compile("\\bcity\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("Occurrence of 'city' is " + count);
    }
}
