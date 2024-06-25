import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        int w=s.nextInt();
        int a=s.nextInt();
        int c=s.nextInt();
        int k=a*75;
        int g=c*30;
        int h=k+g;
        if(h<=w)
        {
            System.out.println("Boat is stable");
        }
        else
        {
          System.out.println("Boat will drown");  
        }
}
}
