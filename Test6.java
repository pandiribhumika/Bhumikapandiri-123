//prime no or not
import java.util.*;
class Test6
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n,c=0,r=0;
n=s.nextInt();
if(n==1)
{
c=1;
}
else
{
for(int i=2;i<=Math.sqrt(n);i++)
{
r++;
if(n%i==0)
{
c++;
break;
}
}
}
System.out.println(r);
if(c==2)
System.out.println("Prime no");
else
System.out.println("Not a prime no");
}
}

