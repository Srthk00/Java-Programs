import java.util.*;

public class minplatforms {
    private static int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    public static int findMinimumPlatforms(String[] arr, String[] dep) {
        int n = arr.length;
        int[] arrival = new int[n];
        int[] departure = new int[n];
        for (int i = 0; i < n; i++) {
            arrival[i] = toMinutes(arr[i]);
            departure[i] = toMinutes(dep[i]);
        }
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int platformsNeeded = 0, maxPlatforms = 0;
        int i = 0, j = 0;
        while (i < n && j < n) {
            if (arrival[i] <= departure[j]) {
                platformsNeeded++;
                i++;
            } 
            else {
                platformsNeeded--;
                j++;
            }
            maxPlatforms = Math.max(maxPlatforms, platformsNeeded);
        }
        return maxPlatforms;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of trains: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arrivals = new String[n];
        String[] departures = new String[n];
        System.out.println("Enter arrival time:");
        for (int i = 0; i < n; i++) {
            arrivals[i] = sc.nextLine();
        }
        System.out.println("Enter departure time:");
        for (int i = 0; i < n; i++) {
            departures[i] = sc.nextLine();
        }
        int result = findMinimumPlatforms(arrivals, departures);
        System.out.println("Minimum number of platforms required: " + result);
    }
}
