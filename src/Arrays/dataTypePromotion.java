package Arrays;

public class dataTypePromotion {
    public static void main(String[] args) {
        int a = 45;
        calculate(a);
    }
    public static void calculate(int i) {
        System.out.println("using int");
    }

        public static void calculate(double d) {
        System.out.println("using double");
        }
        public static void calculate(float f){
        System.out.println("using float");

    }public static void calculate(long l){
        System.out.println("using long");
    }
}
