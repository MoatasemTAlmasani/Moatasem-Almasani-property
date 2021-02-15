import java.util.HashMap;
import java.util.Map;

/**
 * Created by Afif on 14/02/21.
 */
public class RepeatNo2 {
    public static void reno( int arr[],int x,int z) {
        int a=x/z;
        HashMap<Integer,Integer> d =new HashMap<>();
        for (int i = 0; i <x ; i++) {
            if(!d.containsKey(arr[i]))
                d.put(arr[i],1);
         else
            {
                int c=d.get(arr[i]);
                d.put(arr[i],c+1);  } }
        for (Map.Entry m: d.entrySet())
        {
            Integer t=(Integer)m.getKey();
            if (t>a)
                System.out.print(m.getKey()+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr =new int[]{9,8,7,6,8,4,3,2,9,7,3,1,2};
        int e=10;
        int s=4;
        reno(arr,e,s);}}

