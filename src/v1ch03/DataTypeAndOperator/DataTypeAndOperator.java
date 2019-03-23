package v1ch03.DataTypeAndOperator;
/**
 * Created by lhy on 2019/3/22.
 * 整数类型与运算符
 */
//         整数被 0 除将会产生一个异常， 而浮点数被 0 除将会得到无穷大或 NaN 结果
//         在java中,整数 默认是 int 类型,小数 默认是 double 类型

public class DataTypeAndOperator {
    //      枚举类型: 不能为本地类型，也就是不能出现在function中
    enum Size {SMALL, LARGE}
    public static void main(String[] args){
//      被0除
        int i1 = 15;
        float f1 = 15.0f;
        float f2 = -15.0f;
        double d1 = 15.0d;
        double d2 = -15.0;
        int i2 = 0;
        System.out.println(f1/i2);
        System.out.println(f2/i2);
        System.out.println(d1/i2);
        System.out.println(d2/i2);

//        类型转换
        double x = 9.99733333333333333333333333333333333;
        long lx = Math.round(x);
        int ix = (int) Math.round(x);
        System.out.println(lx);
        System.out.println(ix);
        System.out.println(1 << 3);
        System.out.println(8 >> 3);

//        >>> 运算符会用 0 填充高位
//        -8的二进制为其补码：对应正数8的原码取反加1
//        8的原码为(最高位为符号位) 0000 0000 0000 0000 0000 0000 0000 1000
//        8的反码为(最高位也要翻转) 1111 1111 1111 1111 1111 1111 1111 0111
//        -8的补码为8的反码加1：    1111 1111 1111 1111 1111 1111 1111 1000
//        右移三位，高位用0填充：   0001 1111 1111 1111 1111 1111 1111 1111   -> 536870911
        System.out.println(-8 >>> 3);
//        >> 会用符号位填充高位
//        -8的二进制为其补码：对应正数8的原码取反加1
//        8的原码为(最高位为符号位) 0000 0000 0000 0000 0000 0000 0000 1000
//        8的反码为(最高位也要翻转) 1111 1111 1111 1111 1111 1111 1111 0111
//        -8的补码为8的反码加1：    1111 1111 1111 1111 1111 1111 1111 1000
//        右移三位，高位符号位1填充 1111 1111 1111 1111 1111 1111 1111 1111   -> -1  通过将其减1取反得到十进制数为正1，加上负号为-1。
        System.out.println(-8 >> 3);

//        枚举类型
        Size s = Size.LARGE;
        System.out.println(s);
    }
}
