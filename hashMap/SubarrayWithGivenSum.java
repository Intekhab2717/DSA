package hashMap;

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr={10, 2, -2, -20, 10};
        //int [] arr ={1,5,7,3,8,9,2};
        int max=0,val=0;
        int sum=-10;
        Map<Integer,Integer> map =new HashMap<Integer, Integer>();
        int c_Sum=0,s=0,end=-1,count=0;
        for (int i = 0; i < arr.length; i++) {
            c_Sum=c_Sum+arr[i];
            if(c_Sum-sum==0){
                s=0;
                end=i;
                //break;
                count++;
                System.out.println(s +" "+end);
            }
            if(map.containsKey(c_Sum-sum)){
                s=map.get(c_Sum-sum)+1;
                end=i;
                //break;
                count++;
                System.out.println(s +" "+end);
            }
            map.put(c_Sum,i);
        }
        System.out.println(count);
    }
}
