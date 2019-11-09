package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class ReverseLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here

        String [] arr = sentence.split(" ");

        for (int i =sentence.length()-1; i>=0;i--){
            reversed+=sentence.length();
        }

        System.out.println(Arrays.toString(arr));




        //End your code here. do not modify below statement
        System.out.println(reversed);

    }

}
