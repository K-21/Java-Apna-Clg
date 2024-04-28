public class pairsArray {
    public  static void Array(int a[]){
            for(int i=0;i<a.length-1;i++){
                int curr=a[i];
               for(int j=i+1;j<a.length;j++){
                System.out.print("("+curr+", "+a[j]+") ");
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
        int p[]= {1,2,3,4,5};
        Array(p);
    }
}
