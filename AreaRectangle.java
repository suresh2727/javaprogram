import java.util.Scanner;

class AreaRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // declaration 
        int l;
        System.out.println("Enter length to calculate area");  //display
        l = sc.nextInt();  // initialization
        int b;
        System.out.println("Enter breadth to calculate area");
        b = sc.nextInt();

        // Result 

        int area;
        area = l * b;

        System.err.println("Area of Rectangle is " + area);

    }
}
