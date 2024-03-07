import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of n array");
        int n;
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the N array elements ");
        for(int i=0 ;i<=a.length-1;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter number to be find");
        int x;
        x=sc.nextInt();


        
        int count=0;
        for(int i=0 ;i<=a.length-1;i++){
           if (a[i] == x) {
            System.out.println("Array");
            System.out.println("Found at  " + (i+1));
           }
           
        }
        

        
       
        
    }
}
