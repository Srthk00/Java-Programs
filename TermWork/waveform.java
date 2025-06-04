import java.util.Scanner;

public class waveform {
    public static void convertToWave(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i += 2) {
            if (i > 0 && arr[i - 1] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            if (i < n - 1 && arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        convertToWave(arr);
        System.out.println("Wave form of the array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
