import java.util.Arrays;

/**
 * 有序二维数组(从左到右，从上到下递增)中查找有无指定数字——001
 *
 * @author ltc
 * @create 2018-01-04 14:06
 **/
public class FindIn2DimenArray {

    static boolean find(int[][] array, int target){
        int row = 0;    //第一行
        int col = array[0].length-1;    //最右侧
        while(row<array.length && col>=0){  //从右上角开始遍历二维数组
            if(target == array[row][col])
                return true;
            else if(target > array[row][col])   //目标数大于当前数字，直接往下找
                ++row;
            else    //否则往左找
                --col;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,5,15};
        int[] arr2 = {2,6,18};
        int[] arr3 =  {4,8,19};
        int[][] array = new int[3][];
        array[0] = arr1;
        array[1] = arr2;
        array[2] = arr3;
        System.out.println(find(array, 3)); //false
        System.out.println(find(array, 4)); //true
        System.out.println(find(array, 5)); //true
        System.out.println(find(array, 6)); //true
        System.out.println(find(array, 7)); //false
        System.out.println(find(array, 8)); //true
    }
}
