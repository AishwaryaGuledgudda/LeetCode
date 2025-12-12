import java.util.HashMap;
import java.util.Objects;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "III";
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        System.out.println(map);
        int num = 0;
        int prev = 0;

        for(int i = s.length()-1 ; i >= 0 ; i--) {

            int curr = map.get(s.charAt(i));
            if(curr < prev){
                num -= curr;
            }else{
                num += curr;
            }

            prev = curr;

        }
        System.out.println(num);
    }
}
