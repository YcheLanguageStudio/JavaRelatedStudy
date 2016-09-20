/**
 * Created by cheyulin on 16/9/8.
 */
import java.util.*;
public class TestSet {
    public static void main(String[]args){
        Set<Short> s =new HashSet<Short>();
        for(short i=0;i<100;i++){
            s.add(i);
            s.remove((short)(i-1));  //int-valued expression
        }
        System.out.println(s.size());
    }
}
