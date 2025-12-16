import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";

        if(s.length()!=t.length()){
            System.out.println("False");
            //return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char original = s.charAt(i);
            if(map.containsKey(original)){
                map.put(original,map.get(original)+1);
            } else map.put(original,1);
        }
//        System.out.println(map);
        for(int i=0;i<t.length();i++){
            char removal = t.charAt(i);
            if(map.containsKey(removal)){
                map.put(removal,map.get(removal)-1);
                if(map.get(removal)==0){
                    map.remove(removal);
                }
            }else {

                System.out.println("false");
                break;
                //return false
            }
        }
        System.out.println("true");
        //return true;

    }
}
