import java.util.*;
class MergeSortedArray {
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int m=s.nextInt();
int a[]=new int[m];
for(int i=0;i<m;i++)
{
a[i]=s.nextInt();
}
int n=s.nextInt();
int b[]=new int[n];
for(int i=0;i<n;i++)
{
b[i]=s.nextInt();
}
int c[]=new int[m+n];
int k=0;
for(int i=0;i<m;i++)
{
c[k]=a[i];
k++;
}
for(int i=0;i<n;i++)
{
c[k]=b[i];
k++;
}
Arrays.sort(c);
for(int i=0;i<k;i++)
{
System.out.print(c[i]+" ");
}
}
}
