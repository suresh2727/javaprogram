import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check it is a Armstrong Number");
        int n = sc.nextInt();
        int y = 0;
        int save = n;

        // calculating of length;
        while (n!=0) {
            y++;
            n=n/10;
        }
        
        n=save; // restoration


        int x;   // Armstrong Number calculation
        int ans;
        int sum=0;
        while (n!=0) {
            x = n%10;
            ans = 1;
            for(int i = 1; i<=y ; i++){
                ans = ans *x;          // sucessive multiplication.
            }
            sum = sum + ans;      // sucessive addition.
            n = n/10;             // to reduce the value of n 

            // till here logic 
        }         
         
    
       
        if(save == sum){
            System.out.println("It is a Armstrong");
        }
        else{
            System.out.println("Not a armstrong number");
        }
    }

}
