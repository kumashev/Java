public class ArithmeticCalculator {
    public int firstNum = 0;
    public int secondNum = 0;

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public ArithmeticCalculator(int firstNum, int secondNum) {
        this.firstNum = this.firstNum + firstNum;
        this.secondNum = this.secondNum + secondNum;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void calculate(Operation operation){
        switch (operation) {
            case ADD:
                System.out.println("Результат добавления двух чисел: " + firstNum + secondNum);
                break;
            case SUBTRACT:
                System.out.println("Результат вычитания двух чисел: "+ (firstNum - secondNum));
                break;
            case MULTIPLY:
                System.out.println("Результат умножения двух чисел: " + firstNum * secondNum);
                break;
            case DIVIDE:
                System.out.println("Результат деления двух чисел: " + firstNum / secondNum);
                break;
            default:
                System.out.println("Неправильно введена операция");
                break;
        }
    }


}
