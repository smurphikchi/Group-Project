package Arrays;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

       // Write a program that prompts the user to input an integer
        // and then outputs the number with the digits reversed.
        // For example, if the input is 12345, the output should be 54321
        String num;
        int reversenum=0;
        Scanner in = new Scanner(System.in);
        num = in.nextLine();
        String rev ="";
       // rev+=num;
        for (int i=num.length()-1; i>=0;i--){
            rev += num.charAt(i);
        }System.out.println(rev);

             //System.out.println("Reverse of : "+num+" is "+reversenum);


    }
}
