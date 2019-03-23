package v1ch03.MyString;

/**
 * Created by lhy on 2019/3/23.
 */

// == 运算符检测两个字符串是否相等：
// java中字符串的比较：这个运算符只能够确定两个字串是否放置在同一个位置上。
// JavaScript中字符串的比较：判断值是否相等

// java中的提示：实际上只有字符串常量是共享的，而 + 或 substring 等操作产生的结果并不是共享的。
// 因此，千万不要使甩 == 运算符测试字符串的相等性， 以免在程序中出现糟糕的 bug。
public class String1 {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = null;
        String s3 = "";
        System.out.println(s1);
        System.out.println("hello" == "hello");
        System.out.println(isNullString(s2));
        System.out.println(isEmptyString(s3));
    }

//    判断字符串是否为空
    private static boolean isEmptyString(String str){
        if(str.length() == 0 && str.equals("")){
            return true;
        }else{
            return false;
        }
    }

//    判断字符串是否为null
    private static boolean isNullString(String str){
        if(str == null){
            return true;
        }else{
            return false;
        }
    }
}
