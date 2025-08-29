import java.util.Scanner;
public class Reverse_Array {
    public static void main(String args[]){
        System.out.print("Enter the Size of Array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i<size; i++){
            System.out.print("Enter the Array Element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        int arr1 [] = new int[arr.length];
        int j = 0;
        for(int i = arr.length-1; i>=0; i--){
            arr1[j++] = arr[i];
        }
        System.out.println("Reverse Array: ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr1[i]+" ");
        }
        sc.close();
    }
}
