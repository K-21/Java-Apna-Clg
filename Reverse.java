import java.util.Scanner;
public class Reverse{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=a.nextInt();  
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
        a.close();
    }
}