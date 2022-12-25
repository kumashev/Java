public class Arithmetic {
    public static void main(String[] args) {
        System.out.println("Сумма двух чисел: " + sum(5.4, 4));
        System.out.println("Разность двух чисел: " + dif(10, 7 ));
        System.out.println("Произведение двух чисел: " + multi(3, 8));
        System.out.println("Среднее значание двух чисел: " + ave(12, 34));
        System.out.println("Максимальное из двух чисел: " + max(4, 2));
        System.out.println("Минимальное из двух чисел: " + min(122, 45));
    }
    public static double sum(double firstNum, double secondNum) {
        double x;
        x = firstNum + secondNum;
        return x;
    }
    public static double dif(double firstNum, double secondNum) {
        double y;
        y = firstNum - secondNum;
        return y;
    }
    public static double multi(double firstNum, double secondNum) {
        double z;
        z = firstNum * secondNum;
        return z;
    }
    public static double max(double firstNum, double secondNum) {
        if(firstNum > secondNum){
            return firstNum;
        }else{
            return secondNum;
        }
        }
    public static double min(double firstNum, double secondNum) {
        if (firstNum < secondNum) {
            return firstNum;
        }
        else {
            return secondNum;
        }
    }
    public static double ave(double firstNum, double secondNum) {
        double i;
        i = (firstNum + secondNum)/2;
        return i;
        }
    }
