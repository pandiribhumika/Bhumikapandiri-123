class Test {
     public static int fun(int n)
     {
         int c=0;
         for( int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
         {
             c++;
         }
         }
         return c;
     }
    public static void main(String[] args) {
        int n=100;
        System.out.println("N=100,no.of instuctions O(n^2):"+fun(n));
    }
}
