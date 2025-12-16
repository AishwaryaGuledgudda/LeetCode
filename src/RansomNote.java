import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine ="ab";
        int count =0;
        if(ransomNote.length()>magazine.length()){
            System.out.println("False");
        }

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
            } else map.put(magazine.charAt(i),1);
        }
        System.out.println(map);

        for(int i=0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if(map.containsKey(c)){
                count++;
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    map.remove(c);
                }
            }else count=-1;
        }
        if(count==ransomNote.length()){
            System.out.println("True");
        } else System.out.println("False");
    }
}
