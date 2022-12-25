public class Main{
    public static void main(String[] args) {
        ArithmeticCalculator add = new ArithmeticCalculator(20, 4);
        add.calculate(Operation.MULTIPLY);
        System.out.println(add);

    }
}
