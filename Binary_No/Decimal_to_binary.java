import java.util.*;
public class Decimal_to_binary {
    public static String converter(int n){
        String binary = "";
        while(n>0){
            int rem = n%2;
            binary = rem+binary;
            n/=2;
        }
        return binary;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number: ");
        int n = sc.nextInt();
        String result = converter(n);
        System.out.println("The Binary Number is "+result);
        sc.close();
    }
}
