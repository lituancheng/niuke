/**
 * 找到旋转数组中最小的元素——006
 *
 * @description 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 * @author ltc
 * @create 2018-01-09 10:28
 **/
public class PrintMinNumInRotateArray {

    public static int minNumberInRotateArray(int [] array) {
        if(array.length == 0)
            return 0;
        int low = 0, high = array.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(array[mid] > array[high])
                low = mid + 1;
            else if(array[mid] == array[high])  //处理数据重复的情况（如{1,1,1,1,0,1}）
                high = high - 1;
            else
                high = mid;
        }
        return array[low];
    }

    public static void main(String[] args) {
        int [] array = {4,5,5,6,2,3};
        System.out.println(minNumberInRotateArray(array));
    }
}
