There is a practice of showing a cinema in the auditorium of a college on a cinema day. A cinema day is a day where the sum of Day(D), Month(M), Year(Y)should be divisible by product of 3 and 4. On that particular day the total number of students in the hostel should be greater than 50 but less than 100. Write a program to find whether the given day is cinema day or not.

Input Format

Read day,month,year and number of students

Constraints

1<=n<=10^7

Output Format

Print Cinema Day or Not a Cinema Day

Sample Input 0

3 
3 
1914 
76
Sample Output 0

Cinema Day
Submissions: 279
Max Score: 20
Difficulty: Medium
Rate This Challenge:

    
More
 
im
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
        int D=s.nextInt();
9
        int M=s.nextInt();
10
        int Y=s.nextInt();
11
        int S=s.nextInt();
12
        if( (D+M+Y)%(3*4)==0 && S>50 && S<100)
13
        {
14
            System.out.println("Cinema Day");
15
        }
16
       else
17
        {
18
        System.out.println("Not a Cinema Day");
19
        }
20
}
21
}
