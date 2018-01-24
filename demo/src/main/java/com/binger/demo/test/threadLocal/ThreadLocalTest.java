package com.binger.demo.test.threadLocal;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/1/15 0015
 * Time: 10:14
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ThreadLocalTest {
    private ThreadLocal<String> threadLocal=new ThreadLocal<>();
    private static String jvmMessage;

    public ThreadLocal<String> getThreadLocal() {
        return threadLocal;
    }

    public void setThreadLocal(ThreadLocal<String> threadLocal) {
        this.threadLocal = threadLocal;
    }

    public static String getJvmMessage() {

        return jvmMessage;
    }

    public static void setJvmMessage(String jvmMessage) {
        ThreadLocalTest.jvmMessage = jvmMessage;
    }
}