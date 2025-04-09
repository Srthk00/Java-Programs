import java.util.Scanner;
public class positiveNegativeArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int low=0,high=n-1;
        while(low<high){ 
            if(arr[low]>=0 && arr[high]<0){
                int temp=arr[high];
                arr[high]=arr[low];
                arr[low]=temp;
                low++;
                high--;
            }
            else if(arr[low]<0){
                low++;
            }
            else if(arr[high]>=0){
                high--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}