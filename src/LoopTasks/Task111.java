package LoopTasks;

import java.util.Scanner;

public class Task111 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        // TASK 1
        System.out.println("Enter the number:");
        int x = input.nextInt();
        //your code here
        //----------------------------------------------------------
        int  a = 0, b = 0, c = 1;
        for(int i = 1; i <= x; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print( a + " ");
        }
        // //----------------------------------------------------------
        System.out.println();
        //TASK 2
        System.out.println("Enter word:");
        String str1 = input.next();
        //your code here
        //----------------------------------------------------------
        String result = "";
        if (str1.length()<3 && str1.length()>100) {
            System.out.println("Invalid enter");
        }
        else {
            for (int i = 0; i<str1.length(); i++) {
                if (str1.charAt(i) > 47 && str1.charAt(i) < 58) {
                    result =  result+ str1.charAt(i);
                }
            }
        }
        System.out.println(result);
        //----------------------------------------------------------
        //TASK 3
        //----------------------------------------------------------
        int positive = 0;
        int negative = 0;
        int zero = 0;

        //your code here
        //----------------------------------------------------------
        System.out.println("Enter the number: ");
        int number=input.nextInt();
        input.nextLine();
        System.out.println(" Do you want to continue y/n?");
        String answer = input.nextLine();
        while(answer.toLowerCase().equals("y")){
            System.out.println("Enter the number: ");
            number=input.nextInt();
            input.nextLine();
            System.out.println(" Do you want to continue y/n?");
            answer = input.nextLine();
            if(number<0){
                negative++;
            }else if(number==0){
                zero++;
            }else if(number>0){
                positive++;
            }
        }
        //----------------------------------------------------------
        System.out.println("Positive numbers:"+positive);
        System.out.println("Negative numbers:"+negative);
        System.out.println("Zero numbers:"+zero);

        //TASK 3
        //----------------------------------------------------------
        System.out.println("Enter the word:");
        String str2 = input.next();
        //----------------------------------------------------------
        String back = "";
        for(int i = str2.length()-1; i >= 0; i--) {
            back += str2.charAt(i);
        }
        System.out.println(back);
        if(str2.equals(back)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


    }
}
