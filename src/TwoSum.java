import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={3,8,6,5};
        int target = 9;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length;i++){
            int difference = target-nums[i];
            if(!map.containsKey(difference)){
                map.put(nums[i],i);
            }else {
                int index = map.get(difference);
                System.out.println(i + " ," +index);
                //return new int[] {i, index};
            }
        }
    }
}
