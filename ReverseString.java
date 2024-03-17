package program;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to reverse");
        char[] a = sc.nextLine().toCharArray();

        int i , j;
        char temp;
        for(i=0 , j=a.length-1 ; i<j ; i++ , j--){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }


        System.out.println(a);
    }


   

}
