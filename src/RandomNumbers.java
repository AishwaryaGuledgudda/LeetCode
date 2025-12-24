import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,0};
        int[] ranArr = new int[6];

        Random rand = new Random();

        for(int i=0;i<6;i++){
            ranArr[i] = a[rand.nextInt(10)];
        }
        System.out.println(Arrays.toString(ranArr));
    }
}
