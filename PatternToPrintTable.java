public class PatternToPrintTable {
    public static void main(String[] args) {
        int i,j;
        for(i=1 ; i<=20; i++){
            for(j=1 ; j<=10 ; j++){
                System.out.print(i*j + " ");
            }
            System.out.println(" ");
        }
    }
}
