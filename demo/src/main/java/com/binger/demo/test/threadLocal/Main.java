package com.binger.demo.test.threadLocal;


/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/1/15 0015
 * Time: 10:20
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Main {
    public static void main1() {
        ThreadLocalTest threadLocalTest=new ThreadLocalTest();
        threadLocalTest.getThreadLocal().set("ThreadLocal1");
        threadLocalTest.getThreadLocal().get();

        ThreadLocalTest.setJvmMessage("hello1");
        System.out.println(ThreadLocalTest.getJvmMessage());
    }
}