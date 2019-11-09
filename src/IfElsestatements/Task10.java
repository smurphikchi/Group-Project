package IfElsestatements;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        String dayString= "";
        boolean check = true;

        switch (day){
            case 1:
                dayString = "sunday";
                break;
            case 2:
                dayString = "monday";
                break;
            case 3:
                dayString = "tuesday";
                break;
            case 4:
                dayString = " wednesday";
                break;
            case 5:
                dayString = " thursday";
                break;
            case 6:
                dayString = "friday";
                break;
            case  7:
                dayString = "saturday";
            default:
                System.out.println("Invalid number");
                check = false;

        }
        if (check){
            System.out.println(day + " is "+ dayString);
        }
    }
}
