class Test {
     public static int fun(int n)
     {
         int c=0;
         for( int i=1;i<Math.pow(2,n);i++)
         {
             c++;
         }
         return c;
     }
    public static void main(String[] args) {
        int n=10;
        System.out.println("N=10, no.of instuctions O(2^n):"+fun(n));
    }
}
