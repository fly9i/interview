import org.junit.Test;

import java.util.Arrays;

/**
 * Created by fei.zheng on 2015/1/19 0019.
 */
public class TestGenNum {
    @Test
    public void testGenNum(){
        String [] array = new String [] {"1","98532","986","77","98","53","6","2"};
        System.out.println(ArrayToNumber.genNum(array));
    }
}
