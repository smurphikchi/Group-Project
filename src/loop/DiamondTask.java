package loop;

public class DiamondTask {
    public static void main(String[] args){
        //Write your code here
        for (int i = 0; i<=3; i++){
            for (int j=0;j<3-i; j++)
                System.out.print(" ");
            for (int k =0; k<(2*i+1); k++)
                System.out.print("*");
            System.out.println();
        }
        for (int i=3; i>0; i--) {
            for (int j = 0; j < 4 - i; j++)
                System.out.print(" ");
            for (int k = 0; k <= 2 * (i - 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
