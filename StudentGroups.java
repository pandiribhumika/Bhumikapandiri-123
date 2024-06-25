import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        if(p<100||p>200)
        {
            System.out.println("INVALID INPUT");
        }
        else
        {
          int r=p/4;
           int d=(p/4)+(p%4);
            for(int i=1;i<=3;i++)
            {
                System.out.println(r);
            }
            System.out.println(d);
            
        }
    }
}
