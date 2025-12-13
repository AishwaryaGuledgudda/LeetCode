public class LenghtOfLastWord {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        str=str.trim();
        System.out.println(str);
        char[] arr = str.toCharArray();
        int count =0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==' '){
                break;
            }else count++;
        }
        System.out.println(count);
    }
}

