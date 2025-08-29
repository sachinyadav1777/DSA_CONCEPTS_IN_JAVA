import java.util.*;
public class Binary_to_decimal {
    public static int converter(int n){
        int base = 1;
        int result = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            result = result + rem *base;
            base = base *2;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary number: ");
        int n = sc.nextInt();
        int decimal = converter(n);
        System.out.println("The Decimal Number is "+decimal);
        sc.close();
    }
}
