package v1ch02.Welcome;
import com.javalearning.*;
//import com.javalearning.MyArrayList;

/**
 * Created by lhy on 2019/3/22.
 */
public class Welcome
{
    public static void main(String[] args)
    {
        MyArrayList<Integer> testMyArrayList=new MyArrayList<Integer>();
        System.out.println(testMyArrayList.size());
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++)
            System.out.print("=");
        System.out.println();
    }
}

