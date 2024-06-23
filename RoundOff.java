Write a program to get a float value from the user and display it in the below-mentioned format. HINT: Use ceil() and floor() functions.

Input Format

Input consists of one float value.

Constraints

1<=n<10^7

Output Format

Output consists of one integer, its highest round off value and its lowest round off value.

Sample Input 0

54.5
Sample Output 0

54
55.0
54.0
Submissions: 260
Max Score: 20
Difficulty: Medium
Rate This Challenge:

    
More
 
f
1
import java.io.*;
2
import java.util.*;
3
​
4
public class Solution {
5
​
6
    public static void main(String[] args) {
7
        Scanner s=new Scanner(System.in);
8
        float n=s.nextFloat();
9
        int i=(int)n;
10
        float u=(float)Math.ceil(n);
11
        float d=(float)Math.floor(n);
12
        System.out.println(i);
13
        System.out.printf("%.1f\n",u);
14
        System.out.printf("%.1f\n",d);
15
    }
16
}
