import java.util.Scanner;

public class Reversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number to get reversed");
        num =sc.nextInt(); 
        int b=0;
        int r;

        while (num!=0) {
            r=num%10;
            b=b*10;
            b=b+r;
            num = num/10;
        }
        System.out.println("Reverse String is " + b);
    }
}
