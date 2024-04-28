import java.util.*;
public class hollowRectangle {
    public static void hollow(int tolrow,int tolcol){
        for(int i=1;i<=tolrow;i++)
        {    
            for(int j=1;j<=tolcol;j++)
            {
                if(i==1||i==tolrow||j==1||j==tolcol)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");   
        int tolrow = a.nextInt();
        System.out.print("Enter the number of columns: ");
        int  tolcol = a.nextInt();
         hollow(tolrow,tolcol);  
        a.close();      
        
    }
}
