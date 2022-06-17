package cn.lucas.jvm.t1;

/**
 * 栈内存溢出
 * -Xss256k
 * @author liujie
 * @date 2022-06-17 13:19
 **/
public class Demo1_2 {
    private static int count;
    public static void main(String[] args){
        try {
            method1();
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(count);
        }
    }
    private static void method1(){
        count++;
        method1();
    }
}
