package v1ch03.InputAndOutput;

import java.util.Scanner;

/**
 * Created by liaohuanyu on 2019/3/23.
 */

//不会深入了解System.out.printf的格式化输出
public class InputAndOutput {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("what your name?");
        String name = in.nextLine();

        System.out.println("How old are you?");
        int age = in.nextInt();

        System.out.println("Hello " + name + "! next year, you'll be " + (age + 1) + " years old");

//        格式化输出
        System.out.printf("Hello %s! next year, you'll be %s years old", name , (age+1));
    }
}
