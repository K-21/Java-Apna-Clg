import java.util.*;
public class pattern {
    public static void floyd_pattern(int  n) {   //Floyd's Pattern
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                  System.out.print(a);
                  a++;
                  System.out.print(" ");
            }
            System.out.println();
        } 


    }
    public static void main(String[] args) {
               Scanner p =new Scanner(System.in);
                System.out.print("Enter the line you want to print FLyod Pattern:");
                int n=p.nextInt();
                floyd_pattern(n);
                p.close();               
    }
    
}
