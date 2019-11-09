package Arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class ScannerArray {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        String[] names = new String[6];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter name " + (i + 1));
            names[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(names));
int []arr= new int[50];

        for (int i = 0; i <arr.length; i++) {
            int j = ran.nextInt(100)+1;

            // if (j%2==0);

            System.out.println(""+j+" "+" "+(i+1));
        }

        int [] arr1 = {1,2,-3,4,-34,55,78,90,33,10};
        int count = 0;
        for(int i= 0; i < arr1.length; i++) {
            if(arr1[i] % 2 == 0) {
                count++;
            }
        }
        int [] evenNumbers = new int[count];
        for(int i=0, j=0; i < arr.length; i++) {
            if(arr1[i] % 2 == 0) {
                evenNumbers[j] = arr1[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(evenNumbers));





    }

    }

