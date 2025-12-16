import java.util.Arrays;

public class AnagramMethod2 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        char[] sA = s.toCharArray();
        char[] tA = t.toCharArray();

        Arrays.sort(sA);
        Arrays.sort(tA);

        if(Arrays.equals(sA,tA)){
            System.out.println("true");
        }
        else System.out.println("false");

    }
}
