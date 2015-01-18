import java.util.HashMap;
import java.util.Map;

/**
 * Created by fei.zheng on 2015/1/18 0018.
 */
public class Matrices {

    public static void print1(int factor){
        
    }

    public  static void print2(int n) {


        Map<String,Integer> map=new HashMap<String,Integer>();

        int index=0;
        int start=0;
        int n2=n;
        while(n2>0){
            map.putAll(goRound(index+1,start+1,n2));
            index++;
            start+=n2*4-4;
            n2-=2;
        }

        for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
                System.out.print(map.get((x+1)+"."+(y+1)));
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }

    private static Map<String,Integer> goRound(int index,int start,int n){
        Map<String,Integer> map=new HashMap<String,Integer>();
        int x=index;
        int y=index;
        int value=start;
        for(int i=0;i<n;i++){
            String key=x+"."+y;
            map.put(key,value);
            value++;
            if(i==n-1) {
                x++;
            }else{
                y++;
            }
        }
        for(int i=0;i<n-1;i++){
            String key=x+"."+y;
            map.put(key,value);
            value++;
            if(i==n-2) {
                y--;
            }else{
                x++;
            }
        }
        for(int i=0;i<n-1;i++){
            String key=x+"."+y;
            map.put(key,value);
            value++;
            if(i==n-2) {
                x--;
            }else{
                y--;
            }
        }
        for(int i=0;i<n-2;i++){
            String key=x+"."+y;
            map.put(key,value);
            value++;
            x--;
        }
        return map;
    }

}
