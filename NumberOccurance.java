import java.util.Scanner;

public class NumberOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array");
        n =sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the array elements");
        int i;
        for(i=0 ; i<=a.length-1; i++){
            a[i] = sc.nextInt();

        }

        int x;
        System.out.println("Enter the search element ");
        x= sc.nextInt();
        int count = 0;
        for (i = 0; i <=a.length-1; i++) {
            if (a[i]==x) {
                count++;
            }
            
        }

        System.out.println("Count is " + count);

    }
}
