package com.binger.demo.test.threadLocal;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/1/15 0015
 * Time: 10:22
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Main2 {
    public static void main(String[] args) {
        Main.main1();
        System.out.println(ThreadLocalTest.getJvmMessage());
    }
}