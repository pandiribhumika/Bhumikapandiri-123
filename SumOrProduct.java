import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int p=a*b;
        int e=a+b;
        if(p<=1000)
        {
            System.out.println(p);
        }
        else
        {
            System.out.println(e);
        }
        
    }
}
