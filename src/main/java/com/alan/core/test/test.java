package com.alan.core.test;

import java.util.ArrayList;
import java.util.List;

/**
 * test entry
 * Created by yuedong on 9/10/16.
 */
public class test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("test");
        list.add("test1");
        //普通转换
        ArrayList<String> result1 = (ArrayList<String>) list;
//        test t = new test();

        //静态泛型转换
        String result2 = (convert(list).toString());
        System.out.println(result2);
    }

    private static <T> T convert(Object a) {
        return (T) a;
    }
}
