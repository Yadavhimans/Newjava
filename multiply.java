package KGCOding;
import java.util.Scanner;
public class multiply {
    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
        System.out.println("Give number for multiplication :");
        int num = sc.nextInt();
        printTable(num);

    }
    public static void printTable(int num){
        for(int i = 1;i<=10;i++){
            System.out.println( num + "*" + i+"=" +(num*i));
        }

    }
}
