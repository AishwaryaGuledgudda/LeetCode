import java.util.Arrays;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        boolean isPalin = false;
        if(s.isEmpty()){
            isPalin=true;
            System.out.println(isPalin);
        }
        StringBuilder l = new StringBuilder(s);
        l.reverse();
        if(s.equalsIgnoreCase(String.valueOf(l))){
            isPalin=true;
        }
        System.out.println(isPalin);

    }
}
