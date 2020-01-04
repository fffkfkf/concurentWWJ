package com.wangwenjun.concurrency.chapter1;

/***************************************
 * @author:Alex Wang
 * @Date:2017/2/14 QQ:532500648
 * QQ交流群:286081824
 ***************************************/
public class TemplateMethod1 {

    public final void print(String message) {
        System.out.println("################");
        wrapPrint(message);
        System.out.println("################");
    }

    protected void wrapPrint(String message) {

    }

    public static void main(String[] args) {
        TemplateMethod1 t1 = new TemplateMethod1(){
            @Override
            protected void wrapPrint(String message) {
                System.out.println("*"+message+"*");
            }
        };
        t1.print("Hello Thread");

        TemplateMethod1 t2 = new TemplateMethod1(){
            @Override
            protected void wrapPrint(String message) {
                System.out.println("+"+message+"+");
            }
        };

        t2.print("Hello Thread");

    }
}
