package Arrays;
import java.util.Arrays;

public class ReversTheLetter {
    public static void main(String[] args) {
        String back = "";
        String finalString = "";

        String str = "It started snowing in Chicago";
        String[] arr = str.split(" ");
        for (String word : arr) {


            for (int i = str.length() - 1; i >= 0; i--) {
                back += str.charAt(i);

            }
            finalString += back + "";
            System.out.println(finalString);

        }
    }
}