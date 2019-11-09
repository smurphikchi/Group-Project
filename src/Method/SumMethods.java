package Method;
import java.util.Arrays;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class SumMethods {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 4, 5};
        System.out.println(Arrays.toString(arr));
        System.out.println(sumArray(arr, 4));
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            String s = num + "";
            if (s.endsWith("5")) {
                continue;
            }
            sum += num;
//            if(num % 10 != 5) {
//                sum += num;
//            }
        }
        return sum;
    }

    public static int sumArray(int[] arr, int number) {
        int sum = 0;
        for (int num : arr) {
            String s = num + "";
            if (!s.endsWith(number + "")) {
                sum += num;
            }
//            if(num % 10 != number) {
//                sum += num;
//            }
        }
        return sum;
    }


}
