package cn.lucas.jvm;

/**
 * 演示栈帧
 * @author liujie
 * @date 2022-06-17 12:22
 **/
public class Demo1_1 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        method2(1, 2);
    }

    private static int method2(int a, int b) {
        int c = a + b;
        return c;
    }
}
