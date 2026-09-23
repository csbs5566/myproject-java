public class LongOverflow {
    public static void main(String[] args) {
        // 1. 拿到 long 的最大值
        long maxValue = Long.MAX_VALUE;
        System.out.println("long 的最大值是: " + maxValue);

        // 2. 给它加 1
        long overflowValue = maxValue + 1;
        System.out.println("long 最大值 + 1 的结果是: " + overflowValue);
    }
}