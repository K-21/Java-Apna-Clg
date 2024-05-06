public class sumofInt {
    public static void inverted_pyramid_numbers(int n){
        
        for (int i=1;i<=n;i++){
            int a=1;
            for(int j=1;j<=((n-i)+1);j++){
                System.out.print(a);  
               a++;             
            }
            
            System.out.println(); 
        }    
    }
    public static void main(String[] args) {
        inverted_pyramid_numbers(5);
        
    }
    
}
