import java.util.HashMap;

public class ContainsDup1 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(if(map.containsKey(nums[i])){
                return true;
            }else return false;
        }
    }
}
