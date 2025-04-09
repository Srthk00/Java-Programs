import java.util.Scanner;
public class saddleElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter size of Matrix: ");
        m=sc.nextInt();
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        boolean flag=false;
        for(int i=0;i<m;i++){
            int min=arr[i][0];
            int minIndex=0;
            for(int j=1;j<n;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                    minIndex=j;
                }
            }
            boolean found=true;
            for(int k=0;k<m;k++){
                if(arr[k][minIndex]>arr[i][minIndex]){
                    found=false;
                    break;
                }
            }
            if(found){
                System.out.println("Saddle Point found: "+arr[i][minIndex]);
                flag=true;
            }
        }
        if(!flag){
            System.out.println("No Saddle Point found...");
        }
        sc.close();
    }
}