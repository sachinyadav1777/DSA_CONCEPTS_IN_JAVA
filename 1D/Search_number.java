//  Take an array as input from the user. Search the given number x and print the index at which it occurs 
import java.util.*;
public class Search_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the array element: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number want to search: ");
        int num = sc.nextInt();
        for(int i=0; i<size; i++){
            if(arr[i] == num){
                System.out.println("The number is at Index "+i);
            }
        }
        sc.close();
    }
}
