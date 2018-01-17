/**
 * 二进制中1的个数——009
 * @description 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 *
 * @author ltc
 * @create 2018-01-17 10:23
 **/
public class BitCountOfBinary {

    /*思路：n-1的二进制数是n的二进制数最右侧的1变0,1右侧所有0变1，两者进行&运算后，
      会使最右侧的1变0，其余位不变，循环此操作直到n为0
      例如14的二进制为1110，减1后变成1101，&运算后为1100，以此类推
     */
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;
    }
}
