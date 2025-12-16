import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class WordPattern290 {
    public static void main(String[] args) {
        String pattern ="abba";
        String s = "dog cat cat dog";
        String[] a=s.split(" ");
        System.out.println(Arrays.toString(a));

        if(pattern.length()!=a.length){
            System.out.println("fasle");
            //return false;
        }
        HashMap<Character,Object> map = new HashMap<>();
        for(int i =0;i<a.length;i++) {
            char original = pattern.charAt(i);
            Object replacement = a[i];
            if(!map.containsKey(original)){
                if(map.containsValue(replacement)){
                    System.out.println("false");
                    //return false;
                }else map.put(original,replacement);
            } else {
                Object oldreplacement = map.get(original);
                if(!Objects.equals(oldreplacement, replacement)){
                    System.out.println("False");
                   // return false;
                }
            }
        }
        System.out.println("true");
        //return true;
    }
}
