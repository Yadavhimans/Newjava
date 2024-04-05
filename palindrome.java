package KGCOding;
import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Number");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println("Your number is a palindrome number");
        } else {
            System.out.println("Your number is not a palindrome number");
        }
    }

    public static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    public static int reverse(int zero) {
        int newNum = 0;
        while (zero > 0) {
            int digit = zero % 10;
            newNum = newNum * 10 + digit;
            zero /= 10;
        }
        System.out.println(newNum);
        return newNum;
    }
}
