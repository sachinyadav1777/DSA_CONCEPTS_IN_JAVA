// print the largest and smallest number from the array
import java.util.*;
public class Largest_Smallest_No {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int integers[] = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the array elements: ");
            integers[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<size; i++){
            if(integers[i]<min){
                min = integers[i];
            }
            if(integers[i]>max){
                max = integers[i];
            }
        }
        System.out.println("Largest Number is "+max);
        System.out.println("Smallest Number is "+min);
        sc.close();
    }
}
