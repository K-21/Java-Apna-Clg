import java.util.*;
//import java.math.*;
public class triangle01 {
    public static void pattern01triangle(int n){
          for(int i=1;i<=n;i++){
            for (int j = 1;j <= i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
              }
              System.out.println();
            }
     }

    
    public static void main(String[] args) {
                Scanner p =new Scanner(System.in);
                System.out.print("Enter the 01 traingle you want to  Print:");
                int n=p.nextInt();
                pattern01triangle(n);
                p.close();               

    }
}
