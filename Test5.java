//prime no or not
import java.util.*;
class Test5
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n,c=0,r=0;
n=s.nextInt();
for(int i=1;i<=n;i++)
{
r++;
if(n%i==0)
{
c++;
}
}
System.out.println(r);
if(c==2)
System.out.println("Prime no");
else
System.out.println("Not a prime no");
}
}
