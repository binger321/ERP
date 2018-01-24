package com.binger.demo.test;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/1/19 0019
 * Time: 9:50
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class HelloTest {
    public static void main(String[] args) {
//        String hello="he1";
//        System.out.println(convertString2ListByComma(hello).toString());
        Integer num = 90;
        Integer num2 = 100;
        System.out.println(num/(float)num2* 100 + "%");

        String str = "a,b,c,,";
        String[] ary = str.split(",");
        // 预期大于 3，结果是 3
        System.out.println(ary.length);
    }
    public static List<String> convertString2ListByComma(String str){
        if (str.contains("，")){
            str = str.replaceAll("，",",");
        }
        String[] strings=str.split(",");
        return Arrays.asList(strings);

    }
}