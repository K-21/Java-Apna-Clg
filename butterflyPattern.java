import java.util.Scanner;

public class butterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines want a butterfly:");
        int n = sc.nextInt();
        butterfly(n);
        sc.close();
    }
    public static void butterfly(int n) {
       // 1st half

       for(int i=1;i<=n;i++){
            // stars=i
            for(int j=1;j<=i;j++){
                System.out.println("*");
            }
            // spaces=2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.println(" ");
            }
            //stars=i
            for(int j=1;j<=i;j++){
                System.out.println("*");
        }
       // System.out.println();
    }
        // 2nd half
        for(int i=n;i>=1;i--){
                        // stars=i
                        for(int j=1;j<=1;j++){
                            System.out.println("*");
                        }
                        // spaces=2*(n-i)
                        for(int j=1;j<=2*(n-i);j++){
                            System.out.println(" ");
                        }
                        //stars=i
                        for(int j=1;j<=1;j++){
                            System.out.println("*");
                    }
                    System.out.println();
        }
    }
}