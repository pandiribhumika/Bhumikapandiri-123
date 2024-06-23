import java.util.*;
class Test4
{
public static void main(String args[])
{
int n,t=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)  //n times
{
t=t+1;         //n*n times
}
}
System.out.println(t);
}
}

