package Arrays;

public class MethodTask {
    public static void main(String[] args){
       sayHi();
       oddNumbers();
    }
    public static void sayHi(){
        for (int i =0; i <50; i++) {
            System.out.println("method, that is not inside of main method");
        }
    }
    public static void oddNumbers(){
        for (int i = 0; i<100; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
