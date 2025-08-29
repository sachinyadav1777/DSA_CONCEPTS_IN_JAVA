//  Take an array of names as inout from the user and print them on the screen
import java.util.*;
public class Print_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        String names[] = new String[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the Array Elements: ");
            names[i] = sc.next();
        }
        for(int j = 0; j<size; j++){
            System.out.print(names[j]+" ");
        }
        sc.close();
    }
}
