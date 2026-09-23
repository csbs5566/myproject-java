import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个数字：");
        long num1 = scanner.nextLong();

        System.out.print("请输入运算符（+、-、*、/）：");
        String operator = scanner.next();

        System.out.print("请输入第二个数字：");
        long num2 = scanner.nextLong();

        long result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("计算结果：" + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("计算结果：" + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("计算结果：" + result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("错误：除数不能为0！");
                } else {
                    result = num1 / num2;
                    System.out.println("计算结果：" + result);
                }
                break;
            default:
                System.out.println("错误：请输入有效的运算符！");
        }

        scanner.close();
    }
}