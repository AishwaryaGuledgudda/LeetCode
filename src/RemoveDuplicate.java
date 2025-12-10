import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] a = {0,0,1,1,1,2,2,3,3,4};
        int i=0;
        int j=0;
        int count=1;
        while(j<a.length){
            if(a[i]==a[j]){
                j++;
            }else {
                i++;
                a[i]=a[j];
                j++;
                count++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(count);

    }
}
