/**
 * 字符串中空格替换为%20（不使用replce和replaceAll方法）——002
 *
 * @author ltc
 * @create 2018-01-04 14:30
 **/
public class ReplaceSpaceWithUnicode {

    //主题思路：从左到右查找空格数，从右到左替换（避免频繁变动StringBuffer长度）
    public static String replaceSpace(StringBuffer str) {
        int spaceNum = 0;
        int oldLength;
        for(int i=0;i<(oldLength=str.length());i++){
            if(str.charAt(i) == ' '){   //计算str中空格数量
                ++spaceNum;
            }
        }
        int newLength =oldLength+spaceNum*2;    //每个空格转为%20后会多两个字节
        int indexOld = oldLength-1; //就字符串最右边
        int indexNew = newLength-1; //新字符串最右边
        str.setLength(newLength);
        for(;indexOld>=0 && indexOld<newLength;--indexOld){
            char chr;
            if((chr=str.charAt(indexOld)) == ' '){
                str.setCharAt(indexNew--, '0');
                str.setCharAt(indexNew--, '2');
                str.setCharAt(indexNew--, '%');
            }else {
                str.setCharAt(indexNew--, chr);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Lakers championship, Kobe MVP!");
        System.out.println(replaceSpace(str));
    }
}
