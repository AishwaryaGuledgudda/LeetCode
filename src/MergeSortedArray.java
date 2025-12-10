import java.util.*;

public class MergeSortedArray {
    //Three pointers

    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={2,5,6,0,0,0};
        int m=3;
        int n=3;
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<m;i++){
            res.add(a[i]);
        }
        for(int i=0;i<n;i++){
            res.add(b[i]);
        }
        Collections.sort(res);
        for(int i=0;i<res.size();i++){
            b[i]= res.get(i);
        }
        System.out.println(Arrays.toString(b));



    }
}
