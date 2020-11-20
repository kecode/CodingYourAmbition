package com.kecode._1_basic;

import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        //1、要求用户输入两个数a和b，如果a能被b整除或者a加b大于1000，则输出a；否则输出b。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a: ");
        int a = scanner.nextInt();
        System.out.println("请输入b: ");
        int b = scanner.nextInt();
        if( a%b == 0 || a+b > 1000) {
            System.out.println(a);
        }else {
            System.out.println(b);
        }

        //2、从键盘接收整数参数.如果该数为1-7，打印对应的星期值，否则打印“非法参数”
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("非法参数");
        }


    }
}
