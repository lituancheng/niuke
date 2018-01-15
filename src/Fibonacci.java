/**
 * 求斐波那契数列第n项的值——007
 *
 * @author ltc
 * @create 2018-01-15 11:43
 **/
public class Fibonacci {

    public static int fibonacci(int n) {
        if(n<=1)
            return n;
        int n1 = 0,n2 = 1,res = 0;
        for(int i=2;i<=n;i++){
            res = n1 + n2;
            n1 = n2;
            n2 = res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}