public class FloatTest {
    public static void main(String[] args) {
        // 1. 计算 0.01 * 100
        double result1 = 0.01 * 100;
        System.out.println("0.01 * 100 的结果是：" + result1);

        // 2. 把 0.01 相加 100 次
        double result2 = 0;
        for (int i = 0; i < 100; i++) {
            result2 += 0.01;
        }
        System.out.println("0.01 相加 100 次的结果是：" + result2);
    }
}