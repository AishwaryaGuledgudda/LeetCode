public class IsSubsequence {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            } else j++;
        }
        if(i==s.length()){
            System.out.println("true");
        } else System.out.println("false");
    }
}
