package cn.lucas.jvm.t1;

/**
 * 局部变量的线程安全问题
 *
 * @author liujie
 * @date 2022-06-17 13:00
 **/
public class Demo1_18 {
    static void m1() {
        int x = 0;
        for (int i = 0; i < 5000; i++) {
            x++;
        }
        System.out.println("x = " + x);
    }
}
