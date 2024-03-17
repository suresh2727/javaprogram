package program;

import java.util.Scanner;

public class UpLo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
       
        for (char i : a) {
            if (i>=97 || i<=122) {
                i = Character.toUpperCase(i);
                System.out.println(i);
                System.out.println(a);
                return;
            }
            else if (i>=65 || i<=90) {
               i = Character.toLowerCase(i);
               System.out.println(i);
            }
            else
            {
                return;
            }

           

        }

      

        
        
    }
}
