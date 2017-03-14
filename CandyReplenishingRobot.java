import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] c = new int[t];
        for(int c_i=0; c_i < t; c_i++){
            c[c_i] = in.nextInt();
        }
        // your code goes here
        int b = n;
        int sum = 0;
        for(int t_i = 0; t_i <= t-1 ; t_i++) {
            if(t_i == t){
                break;
            }
            else if(b < 5) {
               sum = sum + (n-b);
               b = b + (n-b); 
            }
            b = b - c[t_i];
           
        }
         System.out.println(sum);   
    }
    
}
