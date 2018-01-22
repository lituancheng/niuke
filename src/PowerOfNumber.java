/**
 * 数值的整数次方——010
 * @description 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
 *
 * @author ltc
 * @create 2018-01-22 15:53
 **/
public class PowerOfNumber {

    /*
      思路：n次方就是乘n次，注意求负数次方和0次方的情况
     */
    public double power(double base, int exponent) {
        double result = 1;
        for(int i=0;i<Math.abs(exponent);i++){
            result *= base;
        }
        if(exponent < 0)
            return 1/result;
        else
            return result;
    }
}
