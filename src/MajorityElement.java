public class MajorityElement {
    public static void main(String[] args) {
        int[] a = {2,2,1,1,1,2,2,1,1,1,1,1,1};
        int el=0;
        int c=0;
        for(int i=0;i<a.length;i++){
            if(c==0){
                el=a[i];
                c++;
            } else if (a[i]==el) {
                c++;
            }else c--;
        }
        System.out.println(el);
    }
}
