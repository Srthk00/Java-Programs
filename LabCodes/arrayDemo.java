import java.util.Arrays; 
import java.util.Scanner; 
 
public class arrayDemo { 
    static Scanner sc = new Scanner(System.in); 
    public static void arraysFunction(int []a, int p, int []b, int q){ 
        int []temp = new int[p+q]; 
        for(int i=0; i<p+q; i++){ 
            if(i<p){ 
                temp[i] = a[i]; 
            }
            else{ 
                temp[i] = b[i-p]; 
            } 
        } 
        Arrays.sort(temp); 
        for(int i=0; i<p+q; i++){ 
            if(i<p){ 
                a[i] = temp[i]; 
            }
            else{ 
                b[i-p] = temp[i]; 
            } 
        } 
    } 
    public static void arraysFunction(int []arr, int k){ 
 
        for(int i=0; i<arr.length; i++){ 
            for(int j=i+1; j<arr.length; j++){ 
                if(arr[i] + arr[j] == k){ 
                    System.out.println(arr[i]+" "+arr[j]); 
                } 
            } 
        } 
    } 
    public static void main(String[] args) { 
        System.out.print("Enter size of Array: "); 
        int n = sc.nextInt(); 
        int []arr = new int[n]; 
        for(int  i=0; i<n; i++){ 
            arr[i] = sc.nextInt(); 
        } 
        System.out.println("Enter target element: "); 
        int k =sc.nextInt(); 
 
        arraysFunction(arr, k); 
 
        System.out.print("Enter p: "); 
        int p = sc.nextInt();  
        int []a = new int[p]; 
        for(int i=0; i<p; i++){ 
            a[i] = sc.nextInt(); 
        } 
 
        System.out.print("Enter q: "); 
 
        int q = sc.nextInt(); 
        int []b = new int[q]; 
        for(int i=0; i<q; i++) { 
            b[i] = sc.nextInt(); 
        } 
        arraysFunction(a, p, b, q); 
        for(int i : a) 
            System.out.print(i+" "); 
        System.out.println(); 
        for(int j : b) 
            System.out.print(j+" "); 
        System.out.println(); 
    } 
}