import java.util.HashSet;

public class HappyNo {
    public static void main(String[] args) {
        // do not runnnn inifinite loop in action
        int n = 19;

        int mod;
        HashSet<Integer> set = new HashSet<>();
        while(true){
            int sSum = 0;
            while(n!=0) {
                mod = n % 10;
                sSum = sSum + mod * mod;
                n = n / 10;
            }

            if(sSum==1){
                System.out.println("True");
                //return true;
            } else n=sSum;

            if(set.contains(n)){
                System.out.println("False");
                //return false;
            }else set.add(n);

        }
    }
}
