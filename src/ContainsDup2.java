import java.util.HashMap;

public class ContainsDup2 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k=1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
            else{
                int diff = Math.abs((i- map.get(nums[i])));
                if(diff<=k){
                    System.out.println("True");
                    //return true;
                }
                else{
                    map.put(nums[i],i);
                }

            }
        }//return false;

    }
}
