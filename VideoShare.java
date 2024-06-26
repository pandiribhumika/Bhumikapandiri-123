“VideoShare” is an online video sharing platform. The company has decided to rate its users channels based on the sum total of the number of views received online and the subscribers. The sum total is reffered to as user points. The rating will be given according to the below charts:

User points ratings: 30-50 Average 51-60 Good 61-80 Excellent 81-100 Outstanding

The whole process is automated and it can be carried out by the company’s system.

Input Format

The input consists of an integer userpoints representing the calculated points

Constraints

30>= userpoints <=100

Output Format

Print rating if not possible print "Invalid Input"

Sample Input 0

77
Sample Output 0

Excellent
Submissions: 260
Max Score: 20
Difficulty: Medium
Rate This Challenge:

    
More
 
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
        int r=s.nextInt();
9
        if(r>=30 && r<=50)
10
         {
11
            System.out.println("Average");
12
         }
13
        else if(r>=51 && r<=60)
14
         {
15
             System.out.println("Good");
16
         }
17
         else if(r>=61 && r<=80)
18
         {
19
             System.out.println("Excellent");
20
         }
21
         else if(r>=81 && r<=100)
22
         {
23
             System.out.println("Outstanding");
24
         }
25
         else
26
         {
27
             System.out.println("Invalid Input"); 
28
         }
29
    }
30
}
