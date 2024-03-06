import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check weather it is a Palindrome");
        int num;
        num =sc.nextInt();
        int save=num;

        int r;
        int b=0;

        while (num!=0) {
            r = num%10;
            b = b*10;
            b = b+r;
            num = num/10;
        }

        if (b==save) {
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }



    }
}
