public class subArraySum{
    public static void SArraySum(int no[]){
         int lar=Integer.MIN_VALUE;
        for(int i=0;i<no.length;i++){
            int start=i;
          //  System.out.print(start);
            for(int j=i+1;j<no.length;j++) { 
                int sum=0;
                int end=j;
                for(int k=start;k<end;k++) {  
                    System.out.print(no[k]+" ");
                    sum+=no[k];
                }
                System.out.println();
                System.out.println( "The sum is : "+sum );
                if(lar < sum) {
                     lar = sum;
                    }
                System.out.println("The largest is:"+lar);
            }
            System.out.println();
        }
        System.out.println("The largest is:"+lar); 
    }
    public static void main(String[] args) {
       int no[]={2,4,6,8,10};       
        SArraySum(no);        
    }
}