import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long n = 0;
        for (int a0 = 0; a0 < t; a0++) {
            n = in.nextLong();
             System.out.println(fibonacci(n));
        }

    }

    public static long fibonacci(long x){
        long sum = 0, n1 = 1, n2 = 2, n3 = n1 + n2;
        while(n3 < x){
            if(n3 % 2 ==0) {
                sum += n3;
            }
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
        return sum + 2;
    }
}
