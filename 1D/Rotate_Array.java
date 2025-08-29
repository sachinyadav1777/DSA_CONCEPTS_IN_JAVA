import java.util.Scanner;
public class Rotate_Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i<size; i++){
            System.out.print("Enter the Array Element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the No. of Rotation: ");
        int n = sc.nextInt();
        for(int j = 0; j<n; j++){
        for(int i = 0; i<arr.length; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1];
            arr[arr.length-1] = temp;
        } 
        for(int k = 0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        sc.close();
        }
    }
}
