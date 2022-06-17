package cn.lucas.jvm.t1;

/**
 * @author liujie
 * @date 2022-06-17 13:01
 **/
public class Demo1_17 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(4);
        sb.append(5);
        sb.append(6);
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                m2(sb);
            }).start();
        }
        System.out.println(sb);
    }

    /**
     * 局部变量sb线程私有，因此线程安全
     */
    private static void m1() {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(2);
        sb.append(3);
        System.out.println(sb.toString());
    }

    /**
    * sb是共享变量，因此线程不安全
    */
    private static void m2(StringBuilder sb) {
        sb.append(1);
        sb.append(2);
        sb.append(3);
    }

    /**
    * sb返回后被称为共享变量，因此线程不安全
    */
    private static StringBuilder m3() {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(2);
        sb.append(3);
        return sb;
    }
}
