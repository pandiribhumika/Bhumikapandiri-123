Mr.Kumar went to purchase stationary items for his office. He asked the shopkeeper for a discount. The shopkeeper said that if he purchases more than 200 quantity of the item, then a discount of 20% can be applied on the total bill amount, excluding the GST. Get the Quantity and price per item as an input and calculate and tell whether Mr.Kumar is eligible for the discount and what would be the net amount he has to pay after the discount. Take the GST at 18%. Net Amount = Total bill amount after discount + GST

Input Format

Enter quantity Enter price per unit

Constraints

1<=n<=10^7

Output Format

Print the output

Sample Input 0

100
5
Sample Output 0

Quantity Ordered 100
Price per item is Rs.5
Total Amount = Rs.500
GST - Rs.90.0
Net Amount Payable is Rs.590.0
Sample Input 1

350
20
Sample Output 1

Quantity Ordered 350
Price per item is Rs.20
Total Amount = Rs.7000
Discount Earned = Rs.1400.0
Amount after Discount - Rs.5600.0
GST - Rs.1008.0
Net Amount Payable is Rs.6608.0
Submissions: 173
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
        Scanner scanner = new Scanner(System.in);
8
        int q = scanner.nextInt();
9
        int p = scanner.nextInt();
10
        double D = 0.20;
11
        double G = 0.18;
12
        int t = q * p;
13
        double i = 0.0;
14
        double a = t;
15
        if (q > 200) {
16
            i = t * D;
17
            a = t - i;
18
        }
19
        double g = a * G;
20
        double n = a + g;
21
        System.out.println("Quantity Ordered " + q);
22
        System.out.println("Price per item is Rs." + p);
23
        System.out.println("Total Amount = Rs." + t); 
24
        if (q > 200) {
25
            System.out.println("Discount Earned = Rs." + i);
26
            System.out.println("Amount after Discount - Rs." + a);
27
        }
28
        System.out.println("GST - Rs." + g);
29
        System.out.println("Net Amount Payable is Rs." + n);
30
    }
31
}
