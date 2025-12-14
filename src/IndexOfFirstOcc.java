public class IndexOfFirstOcc {
    public static void main(String[] args) {
        String haystack="sadaaasad";
        String needle = "sad";
        for(int i=0;i<haystack.length();i++){
            int j=0;
            while(j<needle.length()&& (i+j)<haystack.length()){
                if(needle.charAt(j)!=haystack.charAt(i+j)){
                    break;
                }j++;
            }
            if(j==needle.length()){
                //return i;
            }
        }
        //return -1;
    }
    }
}
