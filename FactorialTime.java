class Test {
     public static int fun(int n)
     {
         int c=0;
         int r=1;
         while(n>=1)
         {
             r=r*n;
             n=n-1;
         }
         for( int i=1;i<=r;i++)
         {
             c++;
         }
         return c;
     }
    public static void main(String[] args) {
        int n=10;
        System.out.println("N=10, no.of instuctions O(n!):"+fun(n));
    }
}
