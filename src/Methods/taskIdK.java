package Methods;

import java.util.Scanner;

public class taskIdK {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

double calls = input.nextDouble();

double bill=0;


        if (calls <= 100)
        {
            bill = 200;
        }
        else if (calls > 100 && calls <= 150)
        {
            calls = calls - 100;
            bill = 200+(0.60 *calls);
        }
        else if (calls > 150 && calls <= 200)
        {
            calls = calls - 150;
            bill = 200+(0.60 *50) + (0.50 *calls);
        }
        else
        {
            calls = calls - 200;
            bill = 200 + (0.60 * 50) + (0.50 * 50) + (0.40 * calls);
        }

        System.out.println("Your bill is $"+bill);

        System.out.println("Enter two words(separate with space):");
        String str3 = input.nextLine();

        //your code here
        //----------------------------------------------------------

        int sum=str3.length()-1;
        System.out.println(sum);
        int space=str3.indexOf(" ");
        System.out.println(str3.substring(0,1).toUpperCase()+str3.substring(1,space)+" "+str3.substring(space+1,space+2).toUpperCase()+str3.substring(space+2));


    }

}

