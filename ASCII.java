import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n=s.next().charAt(0);
        if(n>='A' &&n<='Z')
        {
            System.out.println("Upper");
        }
        else if(n>='a' && n<='z')
        {
           System.out.println("Lower"); 
        }
        else if(n>='0' && n<='9')
        {
            System.out.println("Number");
        }
        else
        {
            System.out.println("Symbol");
        }
    }
}
