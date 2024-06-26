Electricity board has decided to charge rupees based on the units consumed by a particular home. If the units consumed is less than or equal to 200, the cost for one unit is 0.5. If the unit is less than or equal to 400, the cost for one unit is 0.65 and Rs.100 extra charge. If the unit is less than or equal to 600, the cost for one unit is 0.80 and Rs.200 extra charge. If the unit is greater than 600 the cost for one unit is 1.25 and Rs.425 extra charge. You need to now calculate the electricity bill based on the units consumed (given input).

Input Format

Input consists of one integer. This corresponds to the units consumed.

Constraints

1<=n<=10^7

Output Format

The output consists of one integer. This corresponds to the electricity bill in rupees.

Sample Input 0

200
Sample Output 0

Rs.100
Submissions: 242
Max Score: 20
Difficulty: Medium
Rate This Challenge:

    
More
 
,
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
        int u=s.nextInt();
9
        double e=0.0;
10
        if(u<=200)
11
        {
12
            e=u*0.50;
13
        }
14
        else if(u<=400) 
15
        {
16
            e=(u*0.65)+100;
17
        }
18
        else if(u<=600)
19
        {
20
            e=(u*0.80)+200;
21
        }
22
        else 
23
        {
24
            e=(u*1.25)+425;
25
        }
26
        System.out.printf("Rs.%.0f\n",e);    
27
    }
28
}
