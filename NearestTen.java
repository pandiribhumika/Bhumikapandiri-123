import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=n%10;
        int p;
        if(r<5)
        {
            p=n-r;
        }
        else
        {
            p=n+(10-r);
        }
        System.out.println(p);
    }
}
