public class PracticeStringProg {
    public static void main(String[] args) {
        String str1="flower";
        String str2="flowi";
        String[] str3={"flower","flow","flight"};

//        int min = Math.min(str1.length(),str2.length());
//        for(int i=0;i<min;i++){
//            if(str1.charAt(i)!=str2.charAt(i)){
//                break;
//            } else System.out.print(str1.charAt(i));
//        }
        lcp(str3);
    }

    public static void lcp(String[] s){
        String str = s[0];
        for(String s1:s){
            if(s1.length()<str.length()){
                str=s1;//flow
            }
        }
        StringBuilder l = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);// flow's first char "f"
            for(String s2:s){
                if(s2.charAt(i)!=c){
                    break;
                }
            }l.append(c);
        }
        System.out.println(l);

    }
}
