import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        if(s.length()!=t.length()){
            System.out.println("False");
            //return false;
        }
        HashMap<Character,Character> map = new HashMap<>();
        for(int i =0; i<s.length();i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);
            if(!map.containsKey(original)){
                if(map.containsValue(replacement)){
                    System.out.println("False");
                    //return false;
                }else map.put(original,replacement);
            }else {
                char oldreplacement = map.get(original);
                if(oldreplacement!=replacement){
                    System.out.println("false");
                    //return false;
                }
            }
        }
        System.out.println("true");
        //return true;
    }
}
