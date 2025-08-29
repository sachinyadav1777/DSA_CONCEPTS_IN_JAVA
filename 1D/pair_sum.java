import java.util.Scanner;
public class pair_sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i<size; i++){
            System.out.print("Enter the Array Element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Target Value: ");
        int target = sc.nextInt();
        System.out.println("The pairs are: ");
        for(int i = 0; i<size; i++){
            for(int j = i+1; j<size; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                }
            }
        }
        sc.close();
    }
}
