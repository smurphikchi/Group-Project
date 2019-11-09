package loop;

import java.util.Scanner;

public class skipContinue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        for (int i = 0 ; i < 50 ; i ++){
            if (i==3 || i ==13 || i==23 || i==33 || i ==43){
                continue;

            }
            System.out.println(i);

        }
        for (int i= 0; i <50; i++){
            String str = i + "";
            if(str.endsWith("3")){
                continue;
            }
            System.out.println(str);
        }


    }
}
