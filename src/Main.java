import java.util.Scanner;
public class Main {
    public static int addDigits(int num){
        int sum = 0;
        while(num != 0){  // Continue until num = 0
            int temp = num % 10; // Single out last digit of 'num'
            sum += temp; // Add to the cumulative sum
            num /= 10; // Remove the last digit
        }
        return sum; // Return the sum of digits
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the integer you want summed: ");
        int num = scan.nextInt();
        System.out.println(addDigits(num));
    }
}