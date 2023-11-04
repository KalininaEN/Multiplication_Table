public class Main {
    public static void main(String[] args) {

        int num = 1;
        int result;

        for (int i = 0; i <= 7; i++) {
            num = num + 1;
            System.out.println("num = " + num);

            for (int coef = 0; coef < 10; coef++) {
                if (coef > 1) {
                    result = num * coef;
                    System.out.println("result = " + result);
                }
            }
        }
    }
}
