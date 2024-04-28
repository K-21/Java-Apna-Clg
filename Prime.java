import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime or not");
        int n = sc.nextInt();
        int c=2;
        sc.close();
        if(n<=1){
            System.out.println("Neither Prime nor Composite");
        }
        while(c*c<=n){ // in this it just checking for sqrt root of n 
           if(n%c==0){
               System.out.println("Not Prime");
             //  break;
             return;
             /*
                  In return statement the code gets finished or completeand exit the codde
                  in break it only terminate the loop not the program but return will terminate the program if the number is prime
             */
           }    
           c++;
   } 
   System.out.println("Prime");
   
    }

}
