import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long n = 0;
        for (int a0 = 0; a0 < t; a0++) {
            n = in.nextLong();
        }
       long sum = fibonacci(n);
        System.out.println(sum);

    }
    static  long fibonacci(long n){
        int n1,n2,n3,sum=0;
        for(int i=0; i<=n; i++){

            n1 = 1; n2 = 2; n3 = 0;
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if(n>2){
                while(n2%2 == 0) {
                    sum = sum + n2;
                }
            } else {
                sum = 2;
            }

        }
        return sum;
    }

}

