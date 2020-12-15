import java.util.Arrays;
import java.util.Random;
public class Tester {
    public static void main(String[] args) {
        int[] oneToSix = new int[]{5, 3, 4, 2, 1, 6};
        Sorts.bubbleSort(oneToSix);
        System.out.println(Arrays.toString(oneToSix));

        Random rng = new Random(24134234);
        int[] nsquared = new int[10000];
        int[] correctsquared = new int[10000];
        for(int i = 0; i < 10000; ++i) {
            correctsquared[i] = nsquared[i] = rng.nextInt();
        }
        Arrays.sort(correctsquared);
        Sorts.bubbleSort(nsquared);
        System.out.println(Arrays.equals(nsquared, correctsquared));

        int[] linear = new int[(int)1e7];
        int[] correctlinear = new int[(int)1e7];
        for(int i = 0; i < (int)1e7; ++i) {
            correctlinear[i] = linear[i] = rng.nextInt();
        }
        Arrays.sort(linear);
        Sorts.bubbleSort(linear);
        Arrays.sort(correctlinear);
        System.out.println(Arrays.equals(linear, correctlinear));
    }
}
