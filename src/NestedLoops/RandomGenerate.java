package NestedLoops;

import java.util.Random;

public class RandomGenerate {
    public static void main(String[]args){
        Random random = new Random();
       // int num = random.nextInt(10);
       // boolean check;
        String b="";

        for (int i = 0; i<6;  i++) {
            int num = random.nextInt(10);
            // b += num;

            while (b.contains(num + "")) {
                // System.out.print(num);
                num = random.nextInt(10);
            }
            b += num;

            System.out.println(b);

        }

    String number = "";  //125
        for(int i=0; i < 6; i++) {
        int ranNum = random.nextInt(10);
//            if(number.contains(ranNum+ "")) {
//                ranNum = random.nextInt(10);
//            }

        while(number.contains(ranNum + "")) {
            ranNum = random.nextInt(10);
        }
        number += ranNum;
    }
        System.out.println(number);
}
}









