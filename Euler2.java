import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(Solution.fibonacci(n));
           
        }
        
        
    }
    
    public static long fibonacci(long x){
        long n1, n2=0, n3=1;
        long sum = 0;
        while(n3<x){
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
            if(n3%2 == 0 && n3 < x){
                sum += n3;
            }
        }
        return sum;
    }
}
