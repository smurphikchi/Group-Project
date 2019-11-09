package LoopTasks;

import java.util.Scanner;

public class InfiniteHelloBye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("hi")) {
                System.out.println("Hello");
            } else if (input.equalsIgnoreCase("bye")) {
                System.out.println("Good Bye");
            } else {
                System.out.println("good bye forever");
                break;
            }
        }





        int positive = 0;
        int negative = 0;
        int zero = 0;

        //your code here
        //----------------------------------------------------------
//        System.out.println("enter a number: ");
//
//        for (; ; ) {
//            String m = sc.nextLine();
//            if (m.equalsIgnoreCase("y")) {
//                if(m==0){
//                    zero++;
//                }if(m<0);
//                negative++;
//            } if (m%2==0){
//                positive++;
//            }else{
//                System.out.println();
//                break;
//            }











            //----------------------------------------------------------
            System.out.println("Positive numbers:"+positive);
            System.out.println("Negative numbers:"+negative);
            System.out.println("Zero numbers:"+zero);

        }
}