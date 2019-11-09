package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class CarsArray {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("how many cars you have: ");
        int size = input.nextInt();
        input.nextLine();

        String [] myCars = new String[size];
        for (int i =0; i<myCars.length;i++){
            System.out.println("Enter car:"+i);
            String car=input.nextLine();

            myCars[i]=car;



        }
System.out.println(Arrays.toString(myCars));


    }//System.out.println(Arrays.toString(cars));
}
//0) Write a program that asks the number of cars user has
// and create an array of String with given size.
// Then ask the user to enter each car.
// After getting all the cars, print the array.
      //  Flow: Enter number of cars: > 3 Enter car 1: > BMW Enter car 2: > Mercedes Enter car 3: > Toyota
      //  [BMW, Mercedes, Toyota]



