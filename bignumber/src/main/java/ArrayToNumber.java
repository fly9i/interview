import java.util.Arrays;

/**
 * Created by fei.zheng on 2015/1/19 0019.
 */
public class ArrayToNumber {

    public static String genNum(String [] array){
        Arrays.sort(array);
        StringBuffer sb=new StringBuffer();
        String tmp=array[array.length-1];
        for(int i=array.length-1;i>0;i--){
            if(tmp.startsWith(array[i-1])){
                sb.append(array[i-1]);
            }else {
                sb.append(tmp);
                tmp = array[i - 1];
            }
        }
        return sb.toString();
    }
}
