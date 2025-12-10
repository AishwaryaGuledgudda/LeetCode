import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElements {
    public static void main(String[] args) {
        int[] a = {3,2,2,3};
        int key = 2;
        int i=0;
        int j=a.length-1;
        while(i<=j){
            if(a[i]==key){
                if(a[j]==key){
                j--;
                } else {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    i++;
                    j--;
                }
            } else i++;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(i);
    }
}
